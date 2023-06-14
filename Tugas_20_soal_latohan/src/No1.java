/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author user
 */
public class No1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = input("a = ");
        int b = input("b = ");

        System.out.println("Hasil perhitungan angka");
        System.out.println("=========================");
        System.out.println("a + b = " + (a + b)
                + "\na - b = " + (a - b)
                + "\na * b = " + (a * b)
                + "\na / b = " + (a / b)
                + "\na % b = " + (a % b));

        System.out.println("b + a = " + (b + a)
                + "\nb - a = " + (b - a)
                + "\nb * a = " + (b * a)
                + "\nb / a = " + (b / a)
                + "\nb % a = " + (b % a));
    }

    static int input(String word) {
        Scanner in = new Scanner(System.in);
        System.out.print(word);
        int a = in.nextInt();
        return a;
    }
}
