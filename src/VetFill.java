import java.util.Scanner;

public class VetFill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vet =  new int[10];
        vet[0] = n;

        for (int i = 1; i < vet.length; i++) {
            vet[i] = vet[i - 1] * 2;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("N[" + i + "] = " + vet[i]);
        }
    }
}