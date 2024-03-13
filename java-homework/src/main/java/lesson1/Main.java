package lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 8, 11};
        bubbleSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        float medians = getMedians(array);
        System.out.println("Медана массива: " + medians);

        int number = 110001;
        int reverse = reverse(number);
        System.out.println("Обратное число: " + reverse);
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static float getMedians(int[] array) {
        int n = array.length;
        float medians;
        if (n % 2 == 0) {
            medians = (float) (array[n / 2 - 1] + array[n / 2]) / 2;
        } else {
            medians = array[n / 2];
        }
        return medians;
    }

    private static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
