package com.startjava.lesson4.calculator;

import static java.lang.Math.*;

public class Calculator {

    private String srcMathExpression;

    public String getSrcMathExpression() {
        return srcMathExpression;
    }

    public void setSrcMathExpression(String srcMathExpression) {
        this.srcMathExpression = srcMathExpression;
    }

    public void calculate() {
        String[] splitMathExpression = srcMathExpression.split(" ");
        int x = Integer.parseInt(splitMathExpression[0]);
        int y = Integer.parseInt(splitMathExpression[2]);
        char sign = splitMathExpression[1].charAt(0);

        switch (sign) {
            case '+':
                System.out.println("Result" + " = " + Math.addExact(x, y));
                break;
            case '-':
                System.out.println("Result" + " = " + Math.subtractExact(x, y));
            case '*':
                System.out.println("Result" + " = " + Math.multiplyExact(x, y));
                break;
            case '/':
                System.out.println("Result" + " = " + Math.floorDiv(x, y));
                break;
            case '^':
                System.out.println("Result" + " = " + Math.pow(x, y));
                break;
            case '%':
                System.out.println("Result" + " = " + Math.floorMod(x, y));
                break;
        }
    }
}