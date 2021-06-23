package com.irostub;

import java.text.DecimalFormat;

/**
 * 아주 유용하디 유용한 형식화 클래스들
 * 정해진 패턴으로 출력, 정해진 패턴이 있는 데이터를 가공할 수 있다.
 */
public class Ex10_6 {
    public static void main(String[] args) {
        double number  = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###",
        };

        for(int i=0; i < pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n",pattern[i], df.format(number));
        }
    }
}
