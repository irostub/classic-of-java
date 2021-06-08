package com.irostub;

/**
 * 나머지 연산은 음수도 가능하다
 * 하지만 부호는 버려진다
 */
public class Ex3_13 {
    public static void main(String[] args) {
        System.out.println("-10%8 = " + -10 % 8);
        System.out.println("10%-8 = " + 10 % -8);
        System.out.println("-10%-8 = " + -10 % -8);
    }
}
