package com;

public class A {
    private int id;
    private String name;
    private  double weight;
    private  B b;
    public A(){}
    public A(B b){
        this.b=b;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
    public void callByMethod(){
        System.out.println (b.sayHello ( "hansome" ) );
    }
}
