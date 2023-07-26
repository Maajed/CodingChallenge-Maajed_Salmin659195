/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ArrayChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String items : orderIds) {
            if (items.startsWith("B")) {
                System.out.println(items);
            }
        }
        // TODO code application logic here
    }
    
}
