package com.jpinon.the_workshop;

public class SpecialMultiplier {

    /**
     * Create a function that multiplies two integers following these rules:
     * - Don't use multiplication
     * - Don't use division
     * - Don't use bitwise operations
     * - Don't use loops
     */

    public static int multiply(int x, int y) {

        MultiplyData multiplyData = new MultiplyData(x,y);

        multiplyData.multiply();

        return multiplyData.getResult();
    }

}
