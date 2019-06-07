package 集合框架库.Map集合.MapReduce;

public class Order {
    private  String title;
    private  double price;
    private  int amonu;
    public Order(String title, double price, int amonu) {
        this.title = title;
        this.price = price;
        this.amonu = amonu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmonu() {
        return amonu;
    }

    public void setAmonu(int amonu) {
        this.amonu = amonu;
    }

    @Override
    public String toString() {
        return "Order{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", amonu=" + amonu +
                '}';
    }
}
