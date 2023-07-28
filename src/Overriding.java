
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
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dice = new Random();
        int r1 = dice.nextInt();
        int r2 = dice.nextInt(5);
        int r3 = dice.nextInt(10+ 30);

        System.out.println("1st roll: " + r1);
        System.out.println("2nd roll: " + r2);
        System.out.println("3rd roll: " + r3);
        // TODO code application logic here
    }
    
}
