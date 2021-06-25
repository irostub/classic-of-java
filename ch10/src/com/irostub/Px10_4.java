package com.irostub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Px10_4 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Calendar birthday = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        birthday.set(1993, Calendar.SEPTEMBER, 27);
        int result = (int) (((today.getTimeInMillis() - birthday.getTimeInMillis()) / 1000f) / (3600f * 24f));
        System.out.println("birthday = " + format.format(new Date(birthday.getTimeInMillis())));
        System.out.println("today = " + format.format(new Date(today.getTimeInMillis())));
        System.out.println(result + " days");
    }
}
