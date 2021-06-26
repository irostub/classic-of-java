package com.irostub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df  = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2019³â 11¿ù 23ÀÏ");
            System.out.println(df2.format(d));
        } catch(Exception e) {}
    }
}
