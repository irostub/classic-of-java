package com.irostub;

import java.util.Scanner;

public class Px5_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int k = 0; k < words[i].length(); k++) {
                for (int j = 0; j < (int)(Math.random() * words[i].length()); j++) {
                    char temp = question[k];
                    question[k] = question[j];
                    question[j] = temp;
                }
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요>", i + 1, new String(question));
            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.printf("맞았습니다.\n\n");
            }else{
                System.out.printf("틀렸습니다.\n\n");
            }
        }
    }
}
