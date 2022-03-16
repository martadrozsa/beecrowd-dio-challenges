public class Division {
    public static void main(String[] args) {

        int x = 12345678;
        int count = 1;

        do{
            System.out.println(x);
            x = x / 10;
            count++;
        } while(x > 10);

        System.out.println("Total decimal places: " + count);

    }
}




