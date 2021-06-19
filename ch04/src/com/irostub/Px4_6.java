package com.irostub;

public class Px4_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("result = " + (i + j));
                }
            }
        }
    }
}
