package lesson13;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        String original = "1111111111111111111";

//        String[] elemenets = original.split("");
//        int sum = 0;
//        int power = original.length() - 1;
//
//        for (int i = 0; i < original.length() - 1; i++) {
//            sum += Integer.parseInt(elemenets[i]) * Math.pow(2.0, power);
//            --power;
//        }
//        System.out.println(sum);
        long num = 1111111111111111111l;
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(decimalNumber);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
