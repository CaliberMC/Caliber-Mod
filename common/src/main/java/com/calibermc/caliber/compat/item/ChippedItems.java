package com.calibermc.caliber.compat.item;

public class ChippedItems {
    public static int itemCount = 0;

    public static void printItemCounts() {
        System.out.println("Chipped Items Registered: " + itemCount);
    }
    public static void init() {
        itemCount ++;
        printItemCounts();
    }
}
