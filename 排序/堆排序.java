package 排序;

import java.util.Arrays;

public class 堆排序 {
    public static void adjust(int[] array,int start,int end){   //一次调整,时间复杂度为log2n
        int tmp=array[start];
        for(int i=2*start+1;i<=end;i=i*2+1){
            //1.找到左右孩子的最大值的下标；
            if((i<end)&&array[i]<array[i+1]){
                i++;//已经找到左右孩子里面的最大值下标
            }
            if(array[i]>tmp) {       //和父节点进行比较
                array[start]=array[i];
                start=i;
            }
            if(array[i]<tmp){
                array[start]=tmp;
            }
        }
        array[start]=tmp;
    }
    public static void heapSort(int[] array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjust(array,i,array.length-1);
        }
        //以上为把一棵树调整为大根堆
        //接下来进行交换
        for(int j=0;j<array.length-1;j++){
            int tmp=array[array.length-1-j];
            array[array.length-1-j]=array[0];
            array[0]=tmp;
            adjust ( array,0,array.length-1-j-1 );
        }
    }

    public static void main(String[] args) {
        int[] array={7,9,6,8,25,34,16,28,45,96,21} ;
        heapSort ( array );
        System.out.println (Arrays.toString(array) );
    }

}
