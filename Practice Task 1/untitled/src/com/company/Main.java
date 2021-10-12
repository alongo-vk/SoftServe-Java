package com.company;

import java.sql.SQLOutput;

class Product{
    private String name;
    private double price;
    private static int k;


    public Product(String _name, double _price){
        name = _name;
        price = _price;
        k++;
    }

    public Product(){
        k++;
        return;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int count(){
        return k;
    }

}


public class Main {
    public long operation(int... nums) {
        return nums[0] + nums[1];
    }
    public long operation(long num1, long num2) {
        return num1 - num2;
    }
    public static void main(String[] args) {
        Main app = new Main();
        long result = app.operation(5, 3);
        System.out.println(result);
    }
}
