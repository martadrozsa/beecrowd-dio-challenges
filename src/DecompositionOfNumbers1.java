/*Complete a seguinte função para que a mesma devolva todos os possíveis números de quatro dígitos,
onde cada um seja menor ou igual a maxDigit, e a soma dos dígitos de cada número gerado seja 21.
Exemplo: maxDigit= 6 --> 3666, 4566*/

import java.util.ArrayList;
import java.util.List;

public class DecompositionOfNumbers1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(calculation(6));
    }

    public static List<Integer> calculation( int maxDigit) {

        List<Integer> result = new ArrayList<>();

        String maxStr = maxDigit + "" + maxDigit + "" + maxDigit + "" + maxDigit;
        int max = Integer.parseInt(maxStr);


        for (int i = 1000; i <= max; i++) {

            int a = i / 1000;
            int b = (i % 1000) / 100;
            int c = (i % 100) / 10;
            int d = i % 10;

            if (a > maxDigit || b > maxDigit || c > maxDigit || d > maxDigit) {
                continue;
            }

            if (a + b + c + d == 21) {
                String sum = a + "" + b + "" + c + "" + d;
                int sumInt = Integer.parseInt(sum);
                result.add(sumInt);
            }
        }

        if (result.isEmpty()) {
            return null;
        }

        return result;

    }
}



