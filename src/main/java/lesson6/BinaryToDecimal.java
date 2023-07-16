package lesson6;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int number = 98;


        while (number != 0) {
            System.out.print(number % 2);
            number /= 2;
        }
     }
}
