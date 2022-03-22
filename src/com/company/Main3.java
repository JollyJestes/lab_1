package com.company;

import java.util.Scanner;
/**
 Составить программу-генератор чисел Пифагора а, b, с (с2 = а2 + b2).
 В основу положить формулы: a = m2 – n2, b = 2mn, с = m2 + n2 (m, n — натуральные,
 1 < m < k, 1 < n < k, k — данное число). Результат вывести на экран в виде
 таблицы из пяти столбцов: m, n, а, b, с.
 */
public class Main3 {

    public static void main(String[] args) {

        task113();

    }

    private static void task113() {
        Scanner console = new Scanner(System.in);
        int   k , a, b, c;
        System.out.println("Enter k:...");
        k = console.nextInt();
        System.out.println("m n a b c");
        for (int m = 2; m < k; m++) {
            for (int n = 2; n < k - 1 ; n++) {
                a = (int) (Math.pow(m,2)- Math.pow(n,2) );
                b = 2 * m * n ;
                c = (int) (Math.pow(m,2) + Math.pow(n,2));
                System.out.println(m+"={0}" + n +"={1}"+ a+"={2}"+ b+"={3}"+ c+"={4}");
            }
            
        }
    }

}
