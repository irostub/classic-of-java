package com.irostub;

import java.util.Calendar;

public class Ex10_4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2019, Calendar.AUGUST, 31);

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        //roll 과 add 의 차이점 : roll 은 연산하고자 하는 것에만 영향을 준다.
        //즉, 일에 31일을 더했다고 월이 변경되지 않는다. 허나 add 는 영향을 준다.
        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
