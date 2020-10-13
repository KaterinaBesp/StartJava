package com.startjava.lesson4.array;

public class arrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
//        System.out.println(numbers);
//        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}