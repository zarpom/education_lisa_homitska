package lesson5;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] n = {1, -2, 3, -4, 5, 12};


        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                int temp = n[i]; // 1
                n[i] = n[i + 1]; // {-2, -2}
                n[i + 1] = temp;// {-2, 1}
            }
        }

        for (int number : n) {
            System.out.print(number + " ");
        }
    }
}



