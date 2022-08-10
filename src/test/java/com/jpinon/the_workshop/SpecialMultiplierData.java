package com.jpinon.the_workshop;

public class SpecialMultiplierData {
    private final int x;
    private final int y;
    private final int result;

    public SpecialMultiplierData(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getResult() {
        return result;
    }

    public String toString() {
        return "X:" + x + ", Y:" + y + ", Result:" + result;
    }
}
