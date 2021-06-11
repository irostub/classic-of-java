package com.irostub;

/**
 * 반복문에 이름을 붙일 수 있었다.
 * break 나 continue 에서 지정한 부분으로 건너뛸 수 있다.
 */
public class Ex4_19 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
                }
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
