package com.irostub;

public class Px4_1 {
    public static void main(String[] args) {
        int x = 11;
        int year = 420;
        String str = "yes";
        boolean powerOn = false;
        char c = ' ';
        boolean result = x > 10 && x < 20;
        System.out.println("result = " + result);
        c = 'a';
        result = c != 32 && c != 9;
        System.out.println("result = " + result);
        c = '1';
        result = c >= 48 && c <= 57;
        System.out.println("result = " + result);
        c = 'a';
        result = (c >= 65 && c <= 89) || (c >= 97 && c <= 122);
        System.out.println("result = " + result);
        result = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println("result = " + result);
        result = !powerOn;
        System.out.println("result = " + result);
        result = str.equals("yes");
        System.out.println("result = " + result);
    }
}
