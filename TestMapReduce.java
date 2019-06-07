package 集合框架库.Map集合.MapReduce;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
public class TestMapReduce {
    public static void main(String[] args) {
        List<Order> orderList =new ArrayList <> ( );
        orderList.add ( new Order ( "Iphone",899.45,22 ) );
        orderList.add(new Order("外星人",1897.77,45));
        orderList.add ( new Order ( "MacBookPro",1899.96,14 ) );
        orderList.add ( new Order ( "Java学习宝典",7888.9,56 ) );
double TotalPrice=orderList.stream ().map ( order -> order.getPrice ()*order.getAmonu ()).reduce ( (sum,x )->sum+x ).get ();
        System.out.println ("所花的总数额为："+TotalPrice );
        DoubleSummaryStatistics dss=orderList.stream ().mapToDouble ( order->order.getPrice ()*order.getAmonu () ).summaryStatistics ();
        System.out.println ("总量："+dss.getCount () );
        System.out.println ("平均值"+dss.getAverage () );
        System.out.println ("最大值："+dss.getMax () );
        System.out.println ("最小值："+dss.getMin () );
        System.out.println ("总和:"+dss.getSum () );
    }
}
