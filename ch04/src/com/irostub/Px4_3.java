package com.irostub;

public class Px4_3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = result + result + i;
        }
        System.out.println("result = " + result);
    }
}
