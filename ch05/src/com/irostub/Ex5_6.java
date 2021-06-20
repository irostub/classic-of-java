package com.irostub;

public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = {"kim", "park", "yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }

        String temp = names[2];
        System.out.println("temp:" + temp);
        names[0] = "Yu";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
