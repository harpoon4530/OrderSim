package org.base.shelves;

import org.base.protos.Order;
import org.base.protos.Temp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Random;

import static org.base.protos.Temp.cold;
import static org.base.protos.Temp.frozen;
import static org.base.protos.Temp.hot;


public class Shelves {

    private static final Logger logger = LoggerFactory.getLogger(Shelves.class);

    private static final int hotListMaxSize = 10;
    private static final int coldListMaxSize = 10;
    private static final int frozenListMaxSize  = 10;
    private static final int anyListMaxSize = 15;

    private final Map<Temp, List<Order>> shelves;


    private final Random random;


    public Shelves() {

        random = new Random();

        // TODO: this can we improved via reflection
        shelves = new HashMap<>();

        List<Order> hotArr = new ArrayList<>(hotListMaxSize);
        shelves.put(hot, hotArr);

        List<Order> coldArr = new ArrayList<>(coldListMaxSize );
        shelves.put(Temp.cold, coldArr);

        List<Order> frozenArr = new ArrayList<>(frozenListMaxSize);
        shelves.put(Temp.frozen, frozenArr);

        List<Order> anyArr = new ArrayList<>(anyListMaxSize);
        shelves.put(Temp.any, anyArr);

    }

    public void addOrder(Order order) {

        Temp orderTemp = order.getTemp();

        // deliver existing orders
        deliverOrders();

        // Add a decay based prune to the items here
        decayBasedPrune();

        // Get corresponding array
        List<Order> shelf;

        switch(orderTemp) {
            case hot:
                logger.info("Adding a hot order");
                shelf = shelves.get(orderTemp);
                if (shelf.size() < hotListMaxSize) {
                    shelf.add(order);
                } else {
                    shelf = shelves.get(Temp.any);
                    if (shelf.size() >= anyListMaxSize) {
                        removeFromAnyShelfRandomly();
                    }
                    shelf.add(order);

                }
                break;
            case cold:
                logger.info("Adding a cold order");
                shelf = shelves.get(orderTemp);
                if (shelf.size() < coldListMaxSize ) {
                    shelf.add(order);
                } else {
                    shelf = shelves.get(Temp.any);
                    if (shelf.size() >= anyListMaxSize ) {
                        removeFromAnyShelfRandomly();
                    }
                    shelf.add(order);
                }
                break;
            case frozen:
                logger.info("Adding a frozen order");
                shelf = shelves.get(orderTemp);
                if (shelf.size() < frozenListMaxSize) {
                    shelf.add(order);
                } else {
                    shelf = shelves.get(Temp.any);
                    if (shelf.size() >= anyListMaxSize) {
                        removeFromAnyShelfRandomly();
                    }
                    shelf.add(order);

                }
                break;
            case any:
                logger.info("Adding a any order");
                shelf = shelves.get(Temp.any);
                if (shelf.size() >= anyListMaxSize) {
                    removeFromAnyShelfRandomly();
                }
                shelf.add(order);

            default:
                // TODO: throw an exception here!!!
                break;

        }

        reorgShelves();
    }

    private void reorgShelves() {

        List<Order> anyOrderList = shelves.get(Temp.any);

        Iterator<Order> anyShelfIter = anyOrderList.iterator();

        while (anyShelfIter.hasNext()) {
            Order order = anyShelfIter.next();

            switch (order.getTemp()) {
                case hot:
                    if (shelves.get(Temp.hot).size() < hotListMaxSize) {
                        anyShelfIter.remove();
                        shelves.get(Temp.hot).add(order);
                    }
                    break;
                case cold:
                    if (shelves.get(Temp.cold).size() < coldListMaxSize) {
                        anyShelfIter.remove();
                        shelves.get(Temp.cold).add(order);
                    }
                    break;
                case frozen:
                    if (shelves.get(Temp.frozen).size() < frozenListMaxSize) {
                        anyShelfIter.remove();
                        shelves.get(Temp.frozen).add(order);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public int getShelfSize(Temp temp) {
        return shelves.get(temp).size();
    }

    public void removeHead(Temp temp) {
        List<Order> hotOrders = shelves.get(temp);

        hotOrders.remove(0);
    }

    public void deliverOrders() {

        for (Temp temp : Temp.values()) {
            logger.info("Looking for {} orders to be delivered", temp);
            List<Order> orders = shelves.get(temp);
            removeOrders(orders);
        }
    }

    private void removeOrders(List<Order> orderList) {

        if (orderList == null)
            return;

        // TODO: decide if this should go here!
        long currTime = System.currentTimeMillis();
        Iterator<Order> orderIterator = orderList.iterator();

        while(orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if (order.getPickupTime() < currTime) {
                // remove the order
                orderIterator.remove();
                logger.info("Delivered the order: {}", order.getId());
            }

        }
    }

    public double calculateDecay(Order order) {

        double decayValue = 0.0f;

        long currTime = System.currentTimeMillis();
        double orderAge = order.getOrderInsertTime() - currTime;

        if (order.getShelfLife() == 0.0f) {
            throw new RuntimeException("Cannnot divide by 0!!!");
        }

        decayValue = (order.getShelfLife() - orderAge - order.getDecayRate() * orderAge * order.getShelfLife())/order.getShelfLife();

        return decayValue;
    }

    public void decayBasedPrune() {

        for (Temp temp : Temp.values()) {
            logger.info("Looking for {} orders to be decayed", temp);
            List<Order> orders = shelves.get(temp);

            Iterator<Order> orderIter = orders.iterator();

            while (orderIter.hasNext()) {
                Order order = orderIter.next();

                double decayValue = calculateDecay(order);

                if (decayValue <= 0) {
                    orderIter.remove();
                }
            }
        }
    }

    public void getLogString() {

        logger.info("PRINTING THE CURRENT STATE!!!");
        logger.info("\tHOT: {}", shelves.get(hot).size());
        logger.info("\tCOLD: {}", shelves.get(Temp.cold).size());
        logger.info("\tFROZEN: {}", shelves.get(Temp.frozen).size());
        logger.info("\tANY: {}", shelves.get(Temp.any).size());
    }

    private void removeFromAnyShelfRandomly() {

        List<Order> shelf = shelves.get(Temp.any);

        int currentSize = shelf.size();
        int randomIndex = Math.abs(random.nextInt()) % anyListMaxSize;

        shelf.remove(randomIndex);
    }

}
