package lesson2;

public class IntVariable {
    public static void main(String[] args) {
        byte b1 = 127;
        short s1 = b1;


        // неявно переводиться тип з меншого на більший


      //  System.out.println(s1);

        byte b2 = 127;
        short s2 = 10;

        b2 = (byte) s2;
        //явно переводиться тип з більшого на менший

        byte b3 = 127;
        short s3 = 200;

        b3 = (byte) s3;

        System.out.println(b3);


        byte b4 = 127;
        System.out.println(b4 + 1);//byte + int = int


        byte b5 = 127;
        System.out.println((byte) (b5 + 1)); // byte + byte




    }
}
