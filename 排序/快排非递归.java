package 排序;

import java.util.Arrays;
import java.util.Stack;
public class 快排非递归 {
    //用栈进行实现
    public static int partion(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            if (low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while (low < high && array[low] <= tmp) {
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

    public  static  void quickSort(int[] array){
        Stack<Integer> stack=new Stack<>();
        int low=0;
        int high=array.length-1;
        //先进性一趟快排
        int par=partion(array,low,high);
        //判断par是否有两个以上数据
        if(par>low+1){
            stack.push(low);
            stack.push(par-1);
        }if(par<high-1){
            stack.push(par+1);
            stack.push(high);

        }
        //需要判断栈是否为空，不为空，取出两数对
        //进行partion()
        while(!stack.empty()){
            high=stack.pop();
            low=stack.pop();
            par=partion(array,low,high);
            if(par>low+1){
                stack.push(low);
                stack.push(par-1);
            }
            if(par<high-1){
                stack.push(par+1);
                stack.push(high);
            }
        }
    }

    public static void main(String[] args) {
        int[] a={1,3,2,6,5,8,5,0,8};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
