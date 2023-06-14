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
public class No5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Karakter = ");
        char Char = in.nextLine().charAt(0);
        System.out.println(Character.isLetter(Char));
 
        System.out.print("Karakter = ");
        Char = in.nextLine().charAt(0);
        System.out.println(Character.isLetter(Char));
    }
}
