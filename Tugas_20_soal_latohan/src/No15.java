/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class No15 {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        for (int bar = 0; bar < arr.length; bar++) {
            for (int kol = 0; kol < arr[bar].length; kol++) {
                System.out.print(arr[bar][kol] + " ");
            }
            System.out.println();
        }
    }
}
