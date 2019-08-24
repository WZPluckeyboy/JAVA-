package 二叉树.堆;

import 二叉树.堆.IhhHeapImp;

public class TestIhhHeapImp {
    public static void main(String[] args) {
        IhhHeapImp ihhHeapImp=new IhhHeapImp ();
        int[] array={10,2,30,4,5,6,7,8};
        ihhHeapImp.initHeap ( array );
        ihhHeapImp.show ();
        ihhHeapImp.pushHeap(11);
        ihhHeapImp.show();
        ihhHeapImp.popHeap();
        ihhHeapImp.show();
    }
}
