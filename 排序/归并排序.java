package 排序;

import java.util.Arrays;

public class 归并排序 {
    public static  void mergeSort(int[] array,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        //分的过程
        mergeSort(array,start,mid);//递归左边
        mergeSort(array,mid+1,end);//递归右边
        //合的过程
        merge(array,start,mid,end);
    }
    //合并函数
    public  static  void merge(int[] array,int start,int mid,int end){
       int [] tmpArray=new int[array.length];
       int  tmpIndex=start;
       int start2=mid+1;
       int i=start;
       while(start<=mid&&start2<=end){
           if(array[start]<=array[start2]){
               tmpArray[tmpIndex++]=array[start++];
           }else{
               tmpArray[tmpIndex++]=array[start2++];
           }
       }
       //把最后剩下的放进数组
       while (start<=mid){
           tmpArray[tmpIndex++]=array[start++];
       }
       while(start2<=end){
           tmpArray[tmpIndex++]=array[start2++];
       }
       while(i<=end){
           array[i]=tmpArray[i];
           i++;

       }
    }
    public static void main(String[] args) {
        int[] a={1,4,3,6,0,8,5,7};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
