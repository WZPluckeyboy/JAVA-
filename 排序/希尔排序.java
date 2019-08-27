package 排序;

import java.util.Arrays;
import java.util.Random;

public class 希尔排序 {
    public static void shell(int[] array, int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            int j = 0;
            for (j = i - gap; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        long start=System.currentTimeMillis ();
        int[] drr = {5, 3, 1};
        for (int i = 0; i < drr.length; i++) {
            shell ( array, drr[i] );
        }
        long end=System.currentTimeMillis ();
        System.out.println (end-start );
    }

    public static void main(String[] args) {
        Random random = new Random ( );
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt ( 100000) + 1;
        }
        shellSort ( array );
        System.out.println ( Arrays.toString ( array ) );

    }
}
