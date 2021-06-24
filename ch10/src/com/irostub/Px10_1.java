package com.irostub;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Px10_1 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        date.set(2020, Calendar.JANUARY, 5);
        while(date.get(Calendar.YEAR) != 2021){
            if(date.get(Calendar.WEEK_OF_MONTH) == 3){
                System.out.println(format.format(new Date(date.getTimeInMillis()))+"은 2번째 일요일입니다.");
            }
            date.add(Calendar.DATE, 7);
        }
    }
}
