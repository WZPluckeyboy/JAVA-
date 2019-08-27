package 排序;

import java.util.Arrays;

public class 插入排序 {
    public static  void insertSort(int[] array){
        int tmp=0;
        for(int i=1;i<array.length;++i) {
            tmp=array[i];
            int j=0;
            for(j=i-1;j>=0;--j){
                if(array[j]>tmp){
                    array[j+1]  =array[j];
                }
                else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array={45,56,78,90,23,2,46,18,67} ;
        insertSort( array);
        System.out.println (Arrays.toString ( array ) );
    }
}
