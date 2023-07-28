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
        String[] orderIds = {"A111", "B222", "C333", "D444", "E555", "F666", "G777", "H888"};

        for (String items : orderIds) {
            if (items.startsWith("H")) {
                System.out.println(items);
            }
        }
        // TODO code application logic here
    }
    
}
