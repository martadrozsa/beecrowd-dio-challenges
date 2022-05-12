/*Complete a seguinte função para que a mesma devolva todos os possíveis números de quatro dígitos,
onde cada um seja menor ou igual a maxDigit, e a soma dos dígitos de cada número gerado seja 21.
Exemplo: maxDigit= 6 --> 3666, 4566*/

public class DecompositionOfNumbers {
    public static void main(String[] args) throws InterruptedException {

        int maxDig = 8;

        for (int a = 0; a <= maxDig; a++) {
            for (int b = 0; b <= maxDig; b++) {
                for (int c = 0; c <= maxDig; c++) {
                    for (int d = 0; d <= maxDig; d++){
                        //System.out.println(a + "" + b + "" + c + "" + d);
                        if (a + b + c + d == 21) {
                            System.out.println("FOUND: " + a + "" + b + "" + c + "" + d);
                            //Thread.sleep(3000);
                        }
                    }
                }
            }
        }
    }
}
