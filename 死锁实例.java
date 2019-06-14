package 多线程.线程的同步与死锁;
class  Pen{
    private  String pen="笔";
    public String getPen(){
      return pen;
    }
}
class Book{
    private  String book ="书";
    public String getBook(){
        return book;
    }
}
class ThreadA extends Thread {
    private final Pen pen;
    private final Book book;

    ThreadA(Pen pen, Book book) {
        this.pen = pen;
        this.book = book;
    }

    @Override
    public void run() {
        synchronized (this.pen) {
            System.out.println ( Thread.currentThread ( ) .getName ()+ "我有笔我就不给你了" );
            synchronized (this.book) {
                System.out.println ( Thread.currentThread ( ) .getName ()+ "把你的本子给我" );
            }
        }
    }
}
    class ThreadB extends Thread {
        private final Pen pen;
        private final Book book;

        ThreadB(Pen pen, Book book) {
            this.pen = pen;
            this.book = book;
        }

        @Override
        public void run() {
            synchronized (this.book) {
                System.out.println ( Thread.currentThread ( ) .getName ()+ "我有本子我就不给你了" );
                synchronized (this.pen) {
                    System.out.println ( Thread.currentThread ( ).getName () + "把你的笔给我" );
                }
            }
        }
    }
public class 死锁实例 {
    public static void main(String[] args) {
final  Pen pen=new Pen ();
final  Book book=new Book ();
ThreadA threadG=new ThreadA ( pen,book );
        threadG.setName ( "thread-A");
        ThreadB threadF =new ThreadB ( pen,book );
        threadF.setName ( "thread-B" );
        threadG.start ();
        threadF.start ();
    }
}

