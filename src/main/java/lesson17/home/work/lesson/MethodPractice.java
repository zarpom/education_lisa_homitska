package lesson17.home.work.lesson;

public class MethodPractice {
    public static void main(String[] args) {
//        System.out.println(desimalToBinary(10));
        for (int i = 1; i < 200; i++) {
            System.out.println(i + "=" + decimalToBinary(i));
        }
        System.out.println("Вік Лізи:"+ decimalToBinary(15));

//        int number = 10;
//
//        String result = "";
//        while (number != 0) {
//            result += number % 2;
//            number /= 2;
//        }
//        int number1 = 11;
//
//        String result1 = "";
//        while (number != 0) {
//            result += number % 2;
//            number /= 2;
//        }
//        int number2 = 12;
//
//        String result3 = "";
//        while (number != 0) {
//            result += number % 2;
//            number /= 2;
//        }
//    }
    }
    static String decimalToBinary(int number) {
        String result = "";
        while (number != 0) {
            result =  number % 2 + result;
            number /= 2;
        }
        return result;
    }
}
