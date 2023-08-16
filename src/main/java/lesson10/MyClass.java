package lesson10;

class MyClass {
    public static void main(String[] args) {

        String finalNumber = "";
        double num = 456.32;
        int numIntegral = (int) num;
        double afterDot = num - numIntegral;

        while (numIntegral > 0) {
            finalNumber = numIntegral % 2 + finalNumber;
            numIntegral /= 2;
        }

        if (afterDot != 0) {
            finalNumber += ".";

            while (afterDot != 0) {
                afterDot *= 2; //1.28 | 0.56
                int binary =  (int) afterDot; // int (1.28) = 1 | int (0.56) = 0
                finalNumber += binary; // 0101.10 + 1 = 0101.101 | 0101.101 + 0 = 0101.1010
                afterDot -=  binary; // 1.28 - 1 = 0.28 | 0.56 - 0

            }
        }
        System.out.println(finalNumber);
    }
}