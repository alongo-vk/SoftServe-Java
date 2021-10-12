package com.company;

import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(century(year));;
    }

    public static int century(int year) {
        if (year%100 == 0){
            return year/100;
        }
        else return  (year/100)+1;
    }
}
