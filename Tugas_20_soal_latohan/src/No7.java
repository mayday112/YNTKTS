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
public class No7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String1 : ");
        String S1 = in.nextLine();
        System.out.print("String2 : ");
        String S2 = in.nextLine();
        
        String hasil = S1.concat(" " + S2);
        
        System.out.println("Hasil: " + hasil);
    }
}
