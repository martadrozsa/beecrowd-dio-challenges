import java.util.Random;
import java.util.Scanner;

/*Fazer uma classe Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em quantas tentativas ele acertou.
*/

public class NumberDraw {

    private static final int MAX_RANDOM_NUMBER = 1000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(MAX_RANDOM_NUMBER + 1);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        do {
            if (number == randomNumber) {
                System.out.println("Congratulations, you got the number right!!!");
            } else {
                if (number > randomNumber) {
                    System.out.println("You didn't get the number right! Your guess is greater than the number drawn! Enter a new number: ");
                    count++;
                    number = sc.nextInt();
                } else {
                    System.out.println("You didn't get the number right! Your guess is less than the number drawn Enter a new number: ");
                    count++;
                    number = sc.nextInt();
                }
            }
        } while (number != randomNumber);

        System.out.println("Congratulations, you got the number right!!! You got it right in " + count + " tries");
    }
}
