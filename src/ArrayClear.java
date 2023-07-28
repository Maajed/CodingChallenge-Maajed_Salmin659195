
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ArrayClear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] idnumbers = { "AB11", "BC22", "DE33", "4" };

        System.out.println("");

        System.out.println("Before: " + idnumbers[0].toLowerCase());

        Arrays.fill(idnumbers, 0, 2, null);

        if (idnumbers[0] != null) {
            System.out.println("After: " + idnumbers[0].toLowerCase());
        }

        System.out.println("Clearing 2 ... count: " + idnumbers.length);
        for (String idnumber : idnumbers) {
            System.out.println("-- " + idnumber);
        }
    }
    
}
