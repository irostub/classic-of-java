import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수 입력> ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}
