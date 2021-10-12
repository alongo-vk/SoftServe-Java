package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        if (year%400==0)
            return true;
        else if (year%100 == 0)
            return false;
        else if (year%4 == 0)
            return true;
        else return false;

    }
}
