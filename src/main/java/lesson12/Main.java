package lesson12;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
        int a = 9_999;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}
