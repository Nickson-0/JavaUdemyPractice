package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("integer minimum Value = " + minIntValue);
        System.out.println("integer maximun Value = " + maxIntValue);
        System.out.println("BUSTED MAX Value = " + maxIntValue + 1);
        System.out.println("BUSTED MIN Value = " + (minIntValue - 1));

        int myMaxIntTest = 2147483647;
        
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Minimum Value = " + minByteValue);
        System.out.println("Byte Maximum Value = " + maxByteValue);


        long myLong = 100L;
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value = " + minLongValue);
        System.out.println("Long Maximum Value = " + maxLongValue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("Short Minimum Value = " + minShortValue);
        System.out.println("Short Maximum Value = " + maxShortValue);

        int myTotal  = (maxIntValue/2);

        byte myNewByteValue = (byte) (maxByteValue / 2);
        System.out.println(myNewByteValue);






    }
}
