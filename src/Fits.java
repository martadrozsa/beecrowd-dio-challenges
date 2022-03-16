/*
https://www.beecrowd.com.br/judge/pt/problems/view/1240
 */

import java.util.Scanner;

public class Fits {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();

        int x = 0;
        while (x < count) {
            String numbers = scan.nextLine();
            String[] values = numbers.split(" ");

            String num1 = values[0];
            String num2 = values[1];

            char[] num1Char = num1.toCharArray();
            char[] num2Char = num2.toCharArray();

            int result = 0;

            for (int i = num2.length() - 1, j = num1.length() - 1; i >= 0 && j >= 0; i--, j--) {
                char n1 = num1Char[j];
                char n2 = num2Char[i];
                if (n1 == n2) {
                    result++;
                    if(result == num2.length()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (result == num2.length()) {
                System.out.println("encaixa");
            } else {
                System.out.println("não encaixa");
            }
            x++;
        }
    }
}
