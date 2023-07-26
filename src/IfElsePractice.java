
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
public class IfElsePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();
        int daysUntilExpiration = random.nextInt(12);
        int discountPercentage = 0;

        if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        } else if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        }

        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
    
}
