import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int length = scanner.nextInt();
        int[] list = new int[length];
        for (int i = 1; i <= length; i++) {
            System.out.print(i + ". Elemanı Giriniz :");
            int number = scanner.nextInt();
            list[i - 1] = number;
        }
        System.out.println(Arrays.toString(sort(list)));


    }

    public static int[] sort(int[] array) {
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                }
            }
        }
        return array;
    }
}
