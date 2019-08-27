package 排序;

import java.util.Arrays;

public class 快排递归形式 {
    //一趟快排找中间基准
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

    //由于要递归，所以需要这步
    public static void quick(int[] array, int start, int end) {
        int par = partion(array, start, end);
        //判断左边是否有两个以上的元素，然后递归
        if (par > start + 1) {
            quick(array, start, par - 1);
        }
        //判断右边是否有两个以上的元素，然后递归
        if (par < end - 1) {
            quick(array, par + 1, end);
        }

    }

    //快速排序
    public static int[] quickSort(int[] array) {
        quick(array, 0, array.length - 1);
        return array;
    }

    //测试
    public static void main(String[] args) {
        int[] array = {12, 24, 3, 6, 45, 23, 56, 87, 54};
        System.out.println(Arrays.toString(quickSort(array)));
    }

}

