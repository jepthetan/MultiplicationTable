package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end) : null;
    }

    public Boolean isValid(int start, int end) {
        return (isStartNotBiggerThanEnd(start, end)) && (isInRange(start)) && (isInRange(end));
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String multTable = "";
        for (int index1 = start; index1 <= end; ++index1) {
            multTable += generateLine(start, index1) + System.lineSeparator();
        }
        return multTable.trim();
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
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        MultiplicationTable mt = new MultiplicationTable();
        String output = mt.create(num1, num2);

        System.out.println(output);
    }
}
