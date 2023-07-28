
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
public class DiceIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dice = new Random();
        int r1 = dice.nextInt(5 + 1);
        int r2 = dice.nextInt(6 + 1);
        int r3 = dice.nextInt(7 + 1);
        int total = r1 + r2 + r3;

        System.out.println("Dice roll: " + r1 + " +" + r2 + " + " + r3);

        if (r1 == r2 && r2 == r3) {
            System.out.println("You rolled tripples! +6 bonus to total!");
            total += 6;
        } else if (r1 == r2 || r2 == r3 || r1 == r3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }
        // TODO code application logic here
    }
 
