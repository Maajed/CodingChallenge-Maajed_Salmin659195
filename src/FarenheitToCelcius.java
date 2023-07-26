
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class FarenheitToCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fahrenheit = 94;
        BigDecimal temperature = ((new BigDecimal(fahrenheit).subtract(new BigDecimal(32))).multiply(new BigDecimal(5)).divide(new BigDecimal(9), 2, BigDecimal.ROUND_HALF_UP));
        System.out.println("The temperature is " + temperature + " degree Celsius");
        // TODO code application logic here
        
        
    }
    
}
