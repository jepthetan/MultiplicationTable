package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return null;
    }

    public Boolean isInRange(int number) {
        return null;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return null;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        String output = "";
        for (int index = start; index <= row; index++) {
            output += generateSingleExpression(index, row) + "  ";
        }
        return output.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        String expression = multiplicand + "*" + multiplier +  "=" + product;
        return expression;
    }
}
