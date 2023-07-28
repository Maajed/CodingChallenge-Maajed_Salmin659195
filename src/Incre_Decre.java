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
        int value = 10;
        //Increment
        value = value +1;
        System.out.println("1st Increment: " + value);
        value+=1;
        System.out.println("2nd Increment: " + value);
        value++;
        System.out.println("3rd Increment: " + value);
        value+=1;
        //Decrement
        System.out.println("1st Decrement: " + value);
        value-=1;
        System.out.println("2nd Decrement: " + value);
        value--;
        System.out.println("3rd Decrement: " + value);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
