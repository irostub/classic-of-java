package com.irostub;

/**
 * 출력 예측하기
 */
public class Px3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(y >= 5 || x < 0 && x > 2); //당했다. x 비교쪽이 false 지면 결론적으로 or 로 연결되어있으므로 true
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
