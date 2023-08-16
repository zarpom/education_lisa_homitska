package lesson8;

public class HexToDecimal {
    public static void main(String[] args) {
        String ageResponse = "";
        int age = 20;

        if (age > 18 && age < 23) {
            ageResponse = ageResponse + "ти студент";
        }

        System.out.println(ageResponse);


    }
}
