package lesson4;

public class SearchMin {
    public static void main(String[] args) {
//       list = {1,3,4,5,6}
//       max = list.max()
//       print (max)

//        int[] numbers0;
//        numbers0 = new int[]{1, 2, 3, 4};
//
//        int[] numbers2 = new int[10];
//        numbers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //        for (int i = 0; i < numbers.length; i++){ // i = 5
//                   System.out.println(numbers[i]);
//        }


        int[] numbers = {5, -6, 17, 12, -22, 22};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {// 0 1 2 3
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("min=" + min);
    }
}
