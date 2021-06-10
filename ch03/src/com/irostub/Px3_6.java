package com.irostub;

/**
 * round() 함수 안쓰고 반올림 처리
 */
public class Px3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (float) ((int) (5 / 9f * (fahrenheit - 32) * 100 + 0.5f) * 0.01);

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celcius = " + celcius);
    }
}
