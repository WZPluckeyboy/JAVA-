import java.util.Arrays;
import java.util.Random;
public class Test {
    //先进性一次排序
    public static int pantion(int[] array, int low, int high) {
        int tmp=array[low];
        while(low<high){
            while((low<high)&& array[high]>=tmp){
                high--;
            }
            if(low>=high){
                break;
            }
            else{
                array[low]=array[high];
            }
            while((low<high)&&array[low]<tmp){
                low++;
            }
            if(low>=high){
                break;
            }
            array[high]=array[low];
        }
        array[low]=tmp;
        return low;
    }
    public static void quick(int[] array,int start,int end) {
        int par=pantion ( array,start,end );
        if(par>start+1){   //左边有两个以上元素
            quick ( array,start,par-1 );  //对左边进行递归
        }
        if(par<end-1){    //右边有两个以上元素
            quick ( array,par+1,end );   //对右边进行递归
        }
    }
    public static void quickSort(int[] array) {
       quick(array,0,array.length-1) ;

    }
    public static void main(String[] args) {
        Random random = new Random ( );
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt ( 1000000) + 1;
        }
        quickSort ( array );
        System.out.println ( Arrays.toString ( array ) );

    }
    }