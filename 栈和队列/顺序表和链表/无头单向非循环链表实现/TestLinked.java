package 顺序表和链表.无头单向非循环链表实现;
public class TestLinked {
    public static void main(String[] args) {
   LinkedImp linkedImp=new LinkedImp ( );
   linkedImp.addFirst ( 30 );
   linkedImp.addFirst ( 20 );
   linkedImp.addFirst ( 10 );
   linkedImp.addFirst ( 80 );
   linkedImp.addLast ( 50 );
   linkedImp.addLast ( 90 );
   linkedImp.display ();
        System.out.println ("==============================" );
   linkedImp.show (  linkedImp.reverseList () );
    }
}
