package org.base.pruner;

import java.util.Random;


// TODO: write test cases for this class here!
public class Pruner {

    public static int lowTime = 2*1000; // (2 * 1000)ms
    public static int hiTime = 6*1000;

    public static long getPickupTime() {
        // TODO: this can be optimized by moving it in constructor
        Random random = new Random();
        int randomLookup = random.nextInt(hiTime - lowTime) + lowTime;

        long currTime = System.currentTimeMillis();
        long pickupTime = currTime + randomLookup;
        return pickupTime;
    }

}
