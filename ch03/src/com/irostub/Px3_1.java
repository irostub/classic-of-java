package com.irostub;

/**
 * 묵시적 형변환이 가능한 것은?
 */
public class Px3_1 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i;
        ch = (char) b;
        short s = (short) ch; //short 형하고 비트가 같아서 될 것 같지만 안된다.

        float f = l;
        i = ch;
    }
}
