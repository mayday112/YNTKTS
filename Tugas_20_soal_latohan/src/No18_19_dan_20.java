/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author No 20 Sepanjangan Program
 */
public class No18_19_dan_20 {

    public static void main(String[] args) {
        int rows = 2, columns = 2;

        //No 18 dari sini
        int[][] array = new int[rows][columns];

        int value = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value++;
            }
        }

        //No 19 dari sini
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
