package com.irostub;

public class Px4_4 {
    public static void main(String[] args) {
        int result = 1;
        int idx = 2;
        int count = 0;
        while (result < 100) {
            if (idx % 2 == 0) {
                result -= idx;
            }
            if (idx % 2 == 1) {
                result += idx;
            }
            idx++;
            count++;
        }
        System.out.println(count);
    }
}
