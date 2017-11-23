/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouh;

/**
 *
 * @author Anaïs
 */
public class Bouh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("coucou");
    }
        public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
