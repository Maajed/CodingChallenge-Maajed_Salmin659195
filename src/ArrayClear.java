
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
        String[] pallets = { "B14", "A11", "B12", "A13" };

        System.out.println("");

        System.out.println("Before: " + pallets[0].toLowerCase());

        Arrays.fill(pallets, 0, 2, null);

        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        }

        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
    
}
