package lesson5;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] n = {1, -3, 4, -5, -13, 6, 11};

        int count = 0;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
//////dfdfdfdfdfdfdfdf

        System.out.println(count);
        System.out.println();
        for (int number : n) {
            System.out.print(number + "\n");
        }



        System.out.println("Україна має гривню");

        int kik = 1;
        boolean lil = true;
    }
}



