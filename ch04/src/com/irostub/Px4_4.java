package com.irostub;

public class Px4_4 {
    public static void main(String[] args) {
        int result = 1;
        int i = 1;
        while(true){
            if (i % 2 == 0) {
                result -= i;
            }

            if (i % 2 == 1) {
                result += i;
            }

            if (result > 100) {
                break;
            }
            i++;
        }
        System.out.println("result = " + i);
    }
}
