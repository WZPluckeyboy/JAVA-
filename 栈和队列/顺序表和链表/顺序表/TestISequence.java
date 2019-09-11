package 顺序表和链表.顺序表;

import 顺序表和链表.顺序表.ISequenceImp;

public class TestISequence {
    public static void main(String[] args) {
        ISequenceImp iSequenceImp=new ISequenceImp ();
        iSequenceImp.add ( 0,10 );
        iSequenceImp.add ( 1,20 );
        iSequenceImp.display ();
    }
}
