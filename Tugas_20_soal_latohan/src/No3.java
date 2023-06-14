/*
 * a = 16
 * b = 9 
 * input user
 * a == b
 * a != b
 * a > b 
 * a < b
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class No3 {

    public static void main(String[] args) {
        int a = input("a = ");
        int b = input("b = ");

        System.out.println("a == b = " + (a == b)
                + "\na != b = " + (a != b)
                + "\na > b = " + (a > b)
                + "\na < b = " + (a < b)
                + "\nb >= a = " + (b >= a)
                + "\nb <= a = " + (b <= a));
    }

    static int input(String word) {
        Scanner in = new Scanner(System.in);
        int angka = 0;

        System.out.print(word);
        angka = in.nextInt();

        return angka;
    }
}
