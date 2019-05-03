import java.util.Arrays;
public class 归并排序 {
    public static void merge(int[] array, int start,int mid, int end){
        int[] tmpArray =new int[array.length];
        int tmpIndex=start;
        int start2=mid+1;
        int i=start;
        //两个归并段都有数据的时候
        while(start<=mid && start2<=end){
            if(array[start]<=array[start2]){
                tmpArray[tmpIndex++]=array[start++];
            }
            else{
                tmpArray[tmpIndex++]=array[start2++];
            }
        }
        //退出循环后可能存在某一归并段有数据
        while(start<=mid){
            tmpArray[tmpIndex++]=array[start++];
        }
        while(start2<=end){
            tmpArray[tmpIndex++]=array[start2];
        }
        while(i<=end){
            array[i]=tmpArray[i];
        }
        System.out.println ( Arrays.toString ( array) );

    }
    public static void mergesort(int[] array,int start,int end){
        if(start>=end){
            return ;
        }
        int mid=(start+end)/2;
        //分解过程
        mergesort ( array,start,mid );
        mergesort ( array,mid+1,end );
        //合并过程
        merge ( array,start,mid,end );
    }
    public static void main(String[] args) {
        int[] array= {10,6,7,1,3,9,4,2};
        mergesort(array,0,array.length-1);
        System.out.println (Arrays.toString ( array ) );

    }
    }
   