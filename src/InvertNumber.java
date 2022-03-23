public class InvertNumber {

    public static void main(String[] args) {

        String strNumber = "45789362145";
        StringBuilder invert = new StringBuilder();
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            char current = strNumber.charAt(i);
            invert.append(current);
        }

//        for (int i = strNumber.length() - 1; i >= 0; i--) {
//            char current = strNumber.charAt(i);
//            invert+= current;
//        }
        System.out.println(strNumber + " " + invert);
    }
}
