package com.company;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.Math.*;
import java.util.Date;


public class Main {
    double a=1.1, b=0.004, x=0.2;

    public static void main(String[] args) {
        Main Calculations = new Main();

        Calculations.run();
        System.out.print("\n-------------------");

        Calculations.input();
        Calculations.run();
        System.out.print("\n-------------------");

        Calculations.showdate();
    }

    public void run(){
        double y = calc_y(a,b,x);
        double z = calc_z(a,b,x);
        output(y,z);
    }

    private double calc_y(double a,double b ,double x){
        return (pow(sin(pow((x*x+a),2)),3)-sqrt(x/b));
    }

    private double calc_z(double a,double b ,double x){
        return ((x*x)/a+cos(pow(x+b,3)));
    }

    private void output(double y, double z){
        System.out.println("Y = " + y);
        System.out.printf("Z = %2.2f", z);
    }

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("\nВведіть A:");
        a = s.nextDouble();
        System.out.print("Введіть B:");
        b = s.nextDouble();
        System.out.print("Введіть X:");
        x = s.nextDouble();
    }

    void showdate(){
        Date d = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEEE dd MMMM ");
        System.out.printf("\nToday: " + simpleDate.format(d));
    }
}
