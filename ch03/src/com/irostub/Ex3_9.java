package com.irostub;

/**
 * int + int ==> int 이후 형변환 되어 long 으로 들어간다는 것을 보여준 예제
 * 원하는 결과값을 얻기 위해선 연산 시 명시적으로 형변환을 해주어야 한다
 */
public class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;

        System.out.println("c = " + c);
    }
}
