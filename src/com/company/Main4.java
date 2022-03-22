package com.company;

/**
 * При каком натуральном числе n произведение
 * предшествующего числа и числа
 * , следующего за n, равно 2208?
 */

public class Main4 {

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
