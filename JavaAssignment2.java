/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Curtis
 */
public class JavaAssignment2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Toppings myTopping = new Toppings();
        myTopping.setToppingName();
        
        Base myBase= new Base();
        myBase.setBase();*/
        
        Pizza myPizza = new Pizza();
        myPizza.buildPizza();
        myPizza.displayPizza();
        myPizza.calculateTotal();
    }
    
}
