package 排序;

public class 冒泡排序 {
    public  static  void bubbleSort(int[] array){
        boolean swap=false;//作用为看第一趟遍历完是否有序
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={20,45,10,8,12};
        bubbleSort ( array );
        for(int i:array){
            System.out.print (i+" " );
        }
    }
}
