package lesson16.lesson;

public class MethodLesson {

    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//
//        System.out.println(sum);
//
//        int a1 = 11;
//        int b2 = 22;
//        int c3 = 33;
//
//        int sum1 = a1 + b2 + c3;
//        System.out.println(sum1);
//
//        int b3 = 11;
//        int bb = 22;
//        int c33 = 33;
//
//        int sum12 = b3 + bb + c33;
//        System.out.println(sum1);

//        System.out.println(sum(1, 2, 3));
//        System.out.println(sum(1, 2, 3));

//        System.out.println(helloSuisidnik("Ліза"));
//        System.out.println("Отримає грошей:" + getMoney("Вітя"));
//
//
//        printTired("Ліза", 15);

//        System.out.println(addSymbolToEach("Привіт, айм нид", "%34"));
        System.out.println(makeFuckenHardCoreLetter("Хочу спати!"));
    }

    static String makeFuckenHardCoreLetter(String text) {
        return addSymbolToEach ( "не читай переписку, Тоня! "
                + addSymbolToEach(reverse(text), "%№;"), "1");
    }

    static String reverse(String text) {
        String result = "";
        String[] symbols = text.split("");

        for (int i = symbols.length - 1; i >= 0; i--) {
            result += symbols[i];
        }
         return result;
    }

    static String addSymbolToEach(String text, String symbol) {
        String[] symbols = text.split("");
        String resultText = "";

        for (int i = 0; i < text.length(); i++) {
            resultText += symbols[i] + symbol;
        }

        return resultText;
    }


    static void printTired(String name, int age) {
        System.out.println("Вітаю, мене звуть " + name
                + ". Мені " + age
                + " років, і я відчуваю себе дуже втомленою і сумною людиною!");
        getMoney("12");

    }

    static double getMoney(String name) {
        double money = 0;

        if (name.equals("Ліза") || name.equals("Віталік")) {
            money = 100;
        }
//        else {
//            System.out.println("Іді нахуй");
//        }

        return money;
    }

    static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    static String helloSuisidnik(String name) {
        return "Вітаю, " + name + ", ти жива і мене це дуже радує!";
    }


}
