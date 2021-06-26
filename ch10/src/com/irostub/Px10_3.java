package com.irostub;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Px10_3 {
    static int paycheckCount(Calendar from, Calendar to) {
        if(from == null || to == null) {
            return 0;
        }

        if(from.compareTo(to) == 0 && from.get(Calendar.DATE)==21){
            return 1;
        }
        int monDiff = (to.get(Calendar.YEAR)*12+to.get(Calendar.MONTH)) - (from.get(Calendar.YEAR)*12+from.get(Calendar.MONTH));

        if(monDiff < 0 ){
            return 0;
        }
        if (from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21) {
            monDiff++;
        }
        if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21){
            monDiff--;
        }
        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(format.format(fromDate) + " ~ " + format.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 21);
        toCal.set(2020, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 23);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 22);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);
    }
}
