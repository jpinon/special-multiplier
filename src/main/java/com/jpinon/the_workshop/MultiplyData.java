package com.jpinon.the_workshop;

public class MultiplyData {

    private final int firstOperand;
    private final int secondOperand;
    private int iterator;
    private int result;

    public MultiplyData(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.iterator = secondOperand < 0 ? -secondOperand : secondOperand;
        this.result = 0;
    }

    public int getResult() {
        return mustChangeSymbol() ? -result : result;
    }

    private boolean mustChangeSymbol() {
        return (firstOperand > 0 && secondOperand < 0) || (firstOperand < 0 && secondOperand < 0);
    }

    public void multiply() {
        result = 0;
        recursiveMultiply();
    }

    public void recursiveMultiply() {
        if (iterator != 0) {
            iterator --;
            result += firstOperand;
            recursiveMultiply();
        }
    }
}
