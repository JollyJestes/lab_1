package com.company;

import java.util.Scanner;

/**
 * Даны числа а1, a2, …, а10.
 * Определить сумму их квадратов.
 */


public class Main2 {


    public static void main(String[] args) {

        task88();

    }

    private static void task88() {
        Scanner console = new Scanner(System.in);
        double a = 0 ;
        double result = 0;
        for (int i = 0; i < 10; i++) {

             a = console.nextInt();
            result += a * a;
        }
        System.out.println(result);
    }
}
