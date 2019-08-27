package 排序;

import java.util.Arrays;

public class 选择排序 {
    public static int[] selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int tmp=0;
                    tmp=array[j];
                array[j]=array[i];
                array[i]=tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a={1,8,15,14,32,55,89,42};
        System.out.println(Arrays.toString(selectSort(a)));

    }
}
