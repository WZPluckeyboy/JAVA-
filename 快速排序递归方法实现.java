import java.util.Arrays;
import java.util.Random;
public class 快速排序 {
    public static int pantion(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (( low < high ) && tmp <= array[high]) {
                high--;
            }
            if (low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while (( low < high ) && array[low] <= tmp) {
                low++;
            }
            if (low >= high) {
                break;
            } else {
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        return low;
    }
    public static void quick(int[] array,int start,int end) {
        int par = pantion(array,start,end);
        //找左边是否有两个数据以上
        if(par > start+1){
            quick(array,start,par-1);
        }
        //右边是否有两个数据以上
        if(par < end-1){
            quick(array,par+1,end);
        }
    }
    public static void quickSort(int[] array) {
        long start = System.currentTimeMillis();
        quick(array,0,array.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
  

    public static void main(String[] args) {
        Random random = new Random ( );
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt ( 100000) + 1;
        }
        quickSort ( array );
        System.out.println ( Arrays.toString ( array ) );

    }
    }