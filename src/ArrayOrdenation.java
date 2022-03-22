import java.util.Arrays;
import java.util.Scanner;

/*
Crie um programa que recebe uma string com vários números separados por espaços. O programa deve realizar o seguinte:

- Imprimir o maior, o menor e o número que estiver no meio desse array;
- Imprimir o somatório dos números pares do array;
- Imprima o somatório dos números impares do array.
- Imprimir os números do array em ordem crescente;
- Imprimir os números do array em ordem decrescente;
*/


public class ArrayOrdenation {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        String strNumber = sc.nextLine();

        String strNumber = "55 25 14 12 68 78 6 12 9 4 7 32 16 3 44 22";
        String[] array = strNumber.split(" ");
        int[] numberArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Integer.parseInt(array[i]);
        }

        int higherNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numberArray.length; i++){
            int current = numberArray[i];
            if (current > higherNumber) {
                higherNumber = current;
            }
            if (current < smallestNumber){
                smallestNumber = current;
            }
        }
        System.out.println("Higher number: " + higherNumber);
        System.out.println("Smallest number: " + smallestNumber);

        int half = numberArray.length / 2;
        System.out.println("Middle of array: " + numberArray[half]);

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numberArray.length; i++) {
            int current = numberArray[i];
            if (current % 2 == 0){
                sumEven+= current;
            }
            else {
                sumOdd+= current;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        Arrays.sort(numberArray);
        System.out.println("\nAscending order");
        for (int current : numberArray) {
            System.out.println(current);
        }

        System.out.println("\nDescending order");
        for (int i = numberArray.length - 1; i >= 0; i--) {
            System.out.println(numberArray[i]);
        }


//        System.out.println("\nNew array");
//        int[] newIntArray = new int[numberArray.length];
//
//        for (int i = numberArray.length -1; i >= 0; i--) {
//            newIntArray[i] = numberArray[i];
//        }
//        System.out.println(Arrays.toString(newIntArray));
    }
}
