package com.irostub;

import java.util.Calendar;

/**
 * JDK 1.0부터 전해져오는 고대의 Calendar 와 Date 사용 예
 */
public class Ex10_1 {
    public static void main(String[] args) {
        //인스턴스를 가져올 시 현재 TimeZone 에 따라 초기 시간과 날짜가 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));

        //DATE 와 DAY_OF_MONTH 는 같은 것
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));

        System.out.println("이 달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("밀리초(0~999): " + today.get(Calendar.MILLISECOND));

        //천분의 1초를 시간으로 표시, 1시간 = 60^2
        System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
    }
}
