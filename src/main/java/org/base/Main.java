package org.base;

import org.base.parser.Parser;
import org.base.protos.Order;
import org.base.pruner.Pruner;
import org.base.shelves.Shelves;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world...!");

        // Parse the data into an in memory structure
        Parser parser = new Parser();

        // Initialize the shelves
        Shelves shelves = new Shelves();

        // Now we have ALL the items loaded by the parser!
        List<Order> orders;

        // TODO: use schedule executor here!
        do {
            orders = parser.getNextNOrders();

            // Place the orders on the shelves
            for (Order order : orders) {
                shelves.addOrder(order);
            }

            logger.info("Processed {} orders; sleeping now!", orders.size());
            shelves.getLogString();

            shelves.deliverOrders();

            Thread.sleep(1000); // TODO: change this here to 1000
        } while(orders.size() != 0);

        // Add a sleep here since all the orders have not been delivered
        for (int i = 0; i < Pruner.hiTime/1000; i++) {
            shelves.deliverOrders();
            Thread.sleep(Pruner.hiTime);
        }

        logger.info("Processed ALL the orders; EXITING!!!");
    }


}