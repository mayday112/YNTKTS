/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class No4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();

        System.out.println("Hasil perhitungan");
        System.out.println("=================");
        System.out.println("a = " + a
                + "\nb = " + b
                + "\na = " + (a + b)
                + "\na = " + a
                + "\na = " + (a * b)
                + "\na = " + a
                + "\na = " + (a - b));
    }
}
