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

public class Toppings 
{
    String toppingName;
    double toppingCost;
    int choicePicked;
    
    public Toppings()
    {
        toppingName = " ";
        toppingCost = 0;
        choicePicked = 0;
    }
    
    public Toppings(String name, double cost)
    {
        toppingName = name;
        toppingCost = cost;
    }
    
    public void setToppingName ()
    {
        System.out.println("Press 1 for cheese - $1.00");
        System.out.println("Press 2 for mushrooms - $1.00");
        System.out.println("Press 3 for onions - $0.50");
        System.out.println("Press 4 for olives - $0.75");
        System.out.println("Press 5 for peperoni - $5.00");
        
        Scanner reader = new Scanner(System.in);
        choicePicked=reader.nextInt();
        System.out.println(" ");
        
        switch(choicePicked)
        {
            case 1: toppingName="Cheese";
                    toppingCost=1.00;
                    break;
            case 2: toppingName="Mushrooms";
                    toppingCost=1.00;
                    break;
            case 3: toppingName="Onions";
                    toppingCost=0.50;
                    break;
            case 4: toppingName="Olives";
                    toppingCost=0.75;
                    break;
            case 5: toppingName="Peperoni";
                    toppingCost=5.00;
                    break;     
        } 
    
    }
    
    public String getToppingName()
    {
        return toppingName;
    }
    
    public double getToppingCost()
    {
        return toppingCost;
    }
}
