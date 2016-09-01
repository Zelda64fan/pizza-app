/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs321;

/**
 *
 * @author Curtis
 */
import java.util.Scanner;
public class Base 
{ 
    
    String baseType;
    String sauceType;
    double basePrice;
    int choicePicked2;
    
    public Base()
    {
        baseType = " ";
        sauceType = " ";
        basePrice = 0;
        choicePicked2 = 0; 
    }
    
    public Base(String baseType, String sauceType, double basePrice)
    {
        this.baseType = baseType;
        this.sauceType = sauceType;
        this.basePrice = basePrice;
    }
    
    public void setBase()
    {
        System.out.println("What base would you like on your pizza?");
        System.out.println("Press 1 for thick base (spicy sauce) - $3.00");
        System.out.println("Press 2 for thin base (sweet sauce) - $2.50");
        
        Scanner reader = new Scanner(System.in);
        choicePicked2=reader.nextInt();
        System.out.println(" ");
        
        switch(choicePicked2)
        {
            case 1: baseType = "Thick Base";
                    sauceType = "Spicy Sauce";
                    basePrice = 3.00;
            case 2: baseType = "Thin Base";
                    sauceType = "Sweet Sauce";
                    basePrice = 2.50;
        } 
    }
    
    public String getBaseType()
    {
        return baseType;
    }
    
    public String getSauceType()
    {
        return sauceType;
    }
    
    public double getBasePrice()
    {
        return basePrice;
    }
}
