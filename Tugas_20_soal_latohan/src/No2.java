/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class No2 {

    public static void main(String[] args) {
        int a = input("a = ");
        int b = input("b = ");
        
        boolean and = a != 0 && b != 0;
        boolean or = a != 0 || b != 0;
        boolean nAnd = !(a != 0 && b != 0);
        
        System.out.println("a && b = " + and
                + "\na || b =" + or
                + "\n!(a && b) = " + nAnd);
    }

    static int input(String word) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int angka = 0;

        System.out.print(word);
        while (true) {
            try {
                String temp = null;
                temp = in.readLine();
                if (temp.matches("^[^\\d]+")) {
                    System.out.println("Masukkan angka");
                } else {
                    angka = Integer.parseInt(temp);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Masukkan angka!");
            }
        }
        return angka;

    }
}
