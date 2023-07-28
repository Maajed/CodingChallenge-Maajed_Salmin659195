
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AnotherArrayChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            int n = r.nextInt(70 - 65) + 65;
            char prefix = (char) n;
            String suffix = String.format("%03d", r.nextInt(1000));

            orderIDs[i] = Character.toString(prefix) + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
        // TODO code application logic here
    }
    
}
