package com.company;

import java.util.Scanner;

/**Составить программу возведения натурального числа
 * в третью степень, учитывая следующую закономерность:
 13 = 1
 23 = 3 + 5
 33 = 7 + 9 + 11
 43 = 13 + 15 + 17 + 19
 53 = 21 + 23 + 25 + 27 + 29
 */

public class Main {

    public static void main(String[] args) {

        task63();


    }

    private  static  void task63(){
        Scanner console = new Scanner(System.in);
        System.out.print("n^3=");
        int n = console.nextInt();
        System.out.print(n + "^3=");

        int s = 0 , t = n * (n-1) + 1;
        for (int i = 1; i <= n; i++) {

            System.out.print(t);
            if (i < n);
            System.out.print("+");
            s +=t ;
            t += 2;

        }
        System.out.println("="  + s );

        }



    }
/**
 * Даны числа а1, a2, …, а10.
 * Определить сумму их квадратов.
 */

class lab {

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
/**
 Составить программу-генератор чисел Пифагора а, b, с (с2 = а2 + b2).
 В основу положить формулы: a = m2 – n2, b = 2mn, с = m2 + n2 (m, n — натуральные,
 1 < m < k, 1 < n < k, k — данное число). Результат вывести на экран в виде
 таблицы из пяти столбцов: m, n, а, b, с.
 */
 class lab1 {

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
/**
 * При каком натуральном числе n произведение
 * предшествующего числа и числа
 * , следующего за n, равно 2208?
 */
 class lab2 {

    public static void main(String[] args) {

        task138();

    }

    private static void task138() {
        int i;
        for (i = 1; i < 9999; i++)
            if ((i - 1) * (i + 1) == 2208) break;
        System.out.println("Нужное число - " + i);
    }
}
/**
 * Дано натуральное число n. Вычислить  S = 1/3^2 + 1/5^2 + 1/7^2 ... + 1/(2n+1)^2
 */
class lab3 {
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





