
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
public class ArrayReverseSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] pallets = {"B14", "A11", "B12", "A13"};

        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        System.out.println("Reverse ....");
        Arrays.sort(pallets, (a, b) -> b.compareTo(a));
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        // Clear the array (set elements to null)
        Arrays.fill(pallets, null);

        // Alternatively, if it's an array of primitive types, set elements to default values (e.g., 0 for int)
        // Arrays.fill(pallets, 0);
        // TODO code application logic here
    }
    
}
