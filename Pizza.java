/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Curtis
 */

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Pizza 
{
    Toppings [] myToppings = new Toppings[100];
    Scanner reader = new Scanner(System.in);
    Base myBase = new Base();
    int doneYet=0;
    int numberOfToppings=0;
    double totalCost=0;
    int x = 0; 
    
    public Pizza()
    {
        for(int t=0; t<100; t++)
        {
          myToppings[t]=new Toppings();
        }
              
    }
    
    public void buildPizza()
    {
        System.out.println("This program allows you to make a pizza.");
        System.out.println(" ");
        do
        {
             System.out.println("Would you like to pick a topping? Press"
             + " 1 for yes and 2 for no");
             doneYet=reader.nextInt();
             System.out.println(" ");
                 if (doneYet==2)
            {
                break;
            }
             
            myToppings[x].setToppingName();
            x = x+1;
            
        } while(doneYet==1);
         
        for(int counter=0; counter<100; counter++)
        {
            if(myToppings[counter].getToppingName()!= " ")
                numberOfToppings++;
        }
        
       myBase.setBase();
    }
    
    public void displayPizza()
    {
        System.out.println("You ordered a pizza with the folowing base:");
        System.out.println(myBase.getBaseType()+ " "+ myBase.getSauceType()+ " "+"$"+ myBase.getBasePrice());
        System.out.println(" ");
         
        System.out.println("You ordered a pizza with the following toppings: ");
        for(int counter=0; counter<numberOfToppings; counter++)
        {
          System.out.println(myToppings[counter].getToppingName()+" "+"$"+myToppings[counter].getToppingCost());
        }
        System.out.println(" ");
    }
    
    public void calculateTotal()
    {
        for(int counter=0; counter<numberOfToppings; counter++)
        {
            totalCost = totalCost+myToppings[counter].getToppingCost();
        }
        
        totalCost = totalCost+myBase.getBasePrice();
        System.out.println("Your total cost is: " + "$" + totalCost);
    }
    
    public void setBase(Base base)
    {
        myBase = base;
    }
    
    public Base getBase()
    {
        return myBase;
    }
    
    public void addTopping(Topping topping)
    {
        myToppings[numberOfToppings++] = topping;
    }
    
    public Topping getTopping(int index)
    {
        return myToppings[index];
    }
    
    public int getToppingCount()
    {
        return numberOfToppings;
    }
}

