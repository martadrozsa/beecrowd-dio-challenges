import java.util.Scanner;

public class Combinator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int x = 0;
        while (x < n) {

            String stringFull = sc.nextLine();
            String[] values = stringFull.split(" ");

            String strA = values[0];
            String strB = values[1];

            int size = Math.max(strA.length(), strB.length());

//            if (strAChar.length > strBChar.length) {
//                size = strAChar.length;
//            } else {
//                size = strBChar.length;
//            }

            StringBuilder strResult = new StringBuilder();

            for (int i = 0; i < size; i++) {
                if(i < strA.length()) {
                    strResult.append(strA.charAt(i));
                }

                if(i < strB.length()) {
                    strResult.append(strB.charAt(i));
                }
            }
            x++;

            System.out.println(strResult);
        }
    }
}
