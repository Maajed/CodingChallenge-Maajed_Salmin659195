/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Incre_Decre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 4;
        
        value = value +1;
        System.out.println("First Increment: " + value);
        value+=1;
        System.out.println("Second Increment: " + value);
        value++;
        System.out.println("Third Increment: " + value);
        value-=1;
        
        System.out.println("First Decrement: " + value);
        value-=1;
        System.out.println("Second Decrement: " + value);
        value--;
        System.out.println("Third Decrement: " + value);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
