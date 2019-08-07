package bit.ping;
import com.A;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DemoTest2 {
        private ApplicationContext context=null;
        @Before
        public void initMethod(){
            context=new ClassPathXmlApplicationContext ( new String[]{"applicationContext3.xml"} );
        }
        @Test
        public void testAndB(){
           Bean4 bean4= (Bean4) context.getBean ( "myBean4" );
            /************bean3**************/
            System.out.println("bean2.bean3.id = " + bean4.getBean3().getId());
            System.out.println("bean2.bean3.username = " + bean4.getBean3().getUsername());
            System.out.println("bean2.bean3.addr = " + bean4.getBean3().getAddr());
            /************bean4**************/
            System.out.println("bean2.bean4.id = " + bean4.getBeaan5().getId());
            System.out.println("bean2.bean4.username = " + bean4.getBeaan5().getUsername());
            /************bean5**************/
            System.out.println("bean2.bean5.age = " + bean4.getBean6().getAge());



        }
    }

