package com.irostub;

/**
 * 명시적 형변환의 예
 */
public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println("c = " + c);
    }
}
