/*
https://www.beecrowd.com.br/judge/pt/problems/view/2787
*/

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        int[][] chess = new int[L][C];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++){
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chess[i][j] = 1;
                    }
                }
                else {
                    if (j % 2 != 0) {
                        chess[i][j] = 1;
                    }
               }
            }
        }

        int position = chess[L - 1][C - 1] ;
        System.out.print(position);

        sc.close();
    }
}
