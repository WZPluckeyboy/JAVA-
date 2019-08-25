package 顺序表和链表.带头循环单链表实现;

public class TestHeadSingleListImp {
    public static void main(String[] args) {
        HeadSingleListImp headSingleListImp=new HeadSingleListImp ( );
        headSingleListImp.addFirst ( 30 );
      headSingleListImp.addFirst ( 20 );
      headSingleListImp.addFirst ( 10 );
        headSingleListImp.addFirst ( 80 );
        headSingleListImp.addLast ( 50 );
        headSingleListImp.addLast ( 90 );
     headSingleListImp.display ();
    }
}
