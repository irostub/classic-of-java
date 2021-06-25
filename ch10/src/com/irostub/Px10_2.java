package com.irostub;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Px10_2 {
    public static void main(String[] args) {
        System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2021/05/11)");
        System.out.print(">>");
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            try {
                date = format.parse(scanner.nextLine());
                System.out.println(format2.format(date));
            } catch (ParseException e) {
                System.out.println("형식에 맞게 입력하세요.");
            }
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2021/05/11)");
            System.out.print(">>");
        }
    }
}
