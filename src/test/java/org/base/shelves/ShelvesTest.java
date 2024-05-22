package org.base.shelves;

import org.base.protos.Order;
import org.base.protos.Temp;
import org.base.pruner.Pruner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ShelvesTest {

    private static final Logger logger = LoggerFactory.getLogger(ShelvesTest.class);

    private Shelves shelves;
    private Order hotOrder;
    private Order coldOrder;
    private Order frozenOrder;

    private Order anyOrder;

    @Before
    public void init() {
        shelves = new Shelves();

        hotOrder = Order.newBuilder().setId("hot").setName("hot").setTemp(Temp.hot).build();
        coldOrder = Order.newBuilder().setId("cold").setName("cold").setTemp(Temp.cold).build();
        frozenOrder = Order.newBuilder().setId("frozen").setName("frozen").setTemp(Temp.frozen).build();
        anyOrder = Order.newBuilder().setId("any").setName("any").setTemp(Temp.any).build();
    }

    // Write more test cases for all different types of orders here

    @Test
    public void testHotOrder() {

        shelves.addOrder(hotOrder);

        // TODO: do assertions here!
        shelves.getLogString();

    }

    // TODO: repeat the following tests for different Temp types!!!!

    @Test
    public void testHotNPlusOneOrder() {

        for (int i = 0; i < 11; i++) {
            shelves.addOrder(hotOrder);
        }

        // TODO: do assertions here!
        shelves.getLogString();

    }

    @Test
    public void testHotNPlusAnyOneOrder() {

        for (int i = 0; i < 10; i++) {
            shelves.addOrder(hotOrder);
        }

        for (int i = 0; i < 15; i++) {
            shelves.addOrder(hotOrder);
        }
        // TODO: do assertions here!
        shelves.getLogString();

    }

    // TODO: not the best idea to add sleep in test cases;
    // a properly configured config file per env fixes this issue!
    @Test
    public void testDelivery() throws InterruptedException {

        long currentTime = System.currentTimeMillis();

        long pickupTime = Pruner.getPickupTime();

        Order deliveryOrder = Order.newBuilder()
                .setId("hot")
                .setName("hot")
                .setTemp(Temp.hot)
                .setPickupTime(pickupTime)
                .build();

        shelves.addOrder(deliveryOrder);
        shelves.getLogString();
        Assert.assertEquals(1, shelves.getShelfSize(Temp.hot));


        long sleepTime = pickupTime-currentTime+50; // added 50 for clock skew
        logger.info("Sleeping for: {} ", sleepTime);
        Thread.sleep(sleepTime);

        shelves.deliverOrders();
        shelves.getLogString();
        Assert.assertEquals(0, shelves.getShelfSize(Temp.hot));
    }

    // TODO: write test cases for reorgShelves!!!!
    // This has to deal with time etc so the test case needs to be modified
//    @Test
//    public void testReOrgShelves() {
//
//        // populate both hot and any
//        for (int i = 0; i < 10; i++) {
//            // have to add time to the orders here
//            shelves.addOrder(hotOrder);
//        }
//
//        for (int i = 0; i < 15; i++) {
//            shelves.addOrder(hotOrder);
//        }
//
//        shelves.getLogString();
//        Assert.assertEquals(10, shelves.getShelfSize(Temp.hot));
//
//        // remove the top item from hot
//        shelves.removeHead(Temp.hot);
////        shelves.removeHead(Temp.any);
////
////        Assert.assertEquals(9, shelves.getShelfSize(Temp.hot));
////
////        shelves.addOrder(hotOrder);
////        Assert.assertEquals(10, shelves.getShelfSize(Temp.hot));
//    }

}