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
public class No9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan String: ");
        String string = in.nextLine();
        
        System.out.println("Banyaknya karakter: " + string.toUpperCase());
        System.out.println("Banyaknya karakter: " + string.toLowerCase());
    }
}
