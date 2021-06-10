package com.irostub;

/**
 * 100의 자리 이하 버리고 출력하기
 */
public class Px3_3 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(num - num % 100);
    }
}
