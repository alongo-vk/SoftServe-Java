package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number =in.nextInt();
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        return (number%10+(number%100-number%10)/10+(number-number%10012)/100);
    }
}
