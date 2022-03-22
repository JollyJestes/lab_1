package com.company;

import java.util.Scanner;

/**
 * Дано натуральное число n. Вычислить  S = 1/3^2 + 1/5^2 + 1/7^2 ... + 1/(2n+1)^2
 */
public class Main5 {
    public static void main(String[] args) {

        task38();

    }

    private static void task38() {
        Scanner console = new Scanner(System.in);
        int n ;
        double sum = 0 ;
        System.out.println("Enter number: ");
        n = console.nextInt();
        for (int i = 1; i < n; i++) {
            sum+= 1/(Math.pow((2*i+1),2));
        }
        System.out.println("Sum: " + sum);
    }
}
