/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author untuk no 16 dan no 17
 */
public class No16dan17 {//No16dan17 diganti menjadi myArray4

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for(int bar = 0; bar < array.length; bar++){
            for(int kol = 0; kol < array[bar].length; kol++){
                System.out.printf(" %d", array[bar][kol]);
            }
            System.out.println();
        }
    }
}
