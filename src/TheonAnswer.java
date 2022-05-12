import java.util.Scanner;

public class TheonAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String strNumber = sc.nextLine();

        String[] array = strNumber.split(" ");

        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
           int current = Integer.parseInt(array[i]);
            if (current < min) {
                min = current;
                index = i;
            }
        }
        int position = index + 1;
        System.out.println(position);
        sc.close();
    }
}
