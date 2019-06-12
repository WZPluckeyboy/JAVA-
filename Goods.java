package 多线程.生产者与消费者模型.生产者与消费者;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
public class Goods {
    private String id;
    private  String name;
    private double price;
    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
