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
    
    public Pizza buildPizza()
    {
        Pizza pizza = new Pizza();
        int doneYet = 0;
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
             
            pizza.addTopping(setTopping());
            
        } while(doneYet==1);
        
      pizza.setBase(setBase());
      
      return pizza;
    }
    
    public Base setBase()
    {
        System.out.println("What base would you like on your pizza?");
        System.out.println("Press 1 for thick base (spicy sauce) - $3.00");
        System.out.println("Press 2 for thin base (sweet sauce) - $2.50");
        
        Scanner reader = new Scanner(System.in);
        choicePicked2=reader.nextInt();
        System.out.println(" ");
        
        switch(choicePicked2)
        {
            case 1: return new Base("Thick Base", "Spicy Sauce", 3.00);
            case 2: return new Base("Thin Base", "Sweet Sauce", 2.50);
        }
    }
    
    public Topping setTopping ()
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
            case 1: return new Topping("Cheese", 1.00);
            case 2: return new Topping("Mushrooms", 1.00);
            case 3: return new Topping("Onions", 0.50);
            case 4: return new Topping("Olives", 0.75);
            case 5: return new Topping("Pepperoni", 5.00);
        }
    }
    
    public void displayPizza(Pizza pizza)
    {
        System.out.println("You ordered a pizza with the folowing base:");
        System.out.println(pizza.getBase().getBaseType() + " " +
            pizza.getBase().getSauceType() + " " + "$" +
            pizza.getBase().getBasePrice());
        System.out.println(" ");
         
        System.out.println("You ordered a pizza with the following toppings: ");
        for(int counter=0; counter<pizza.getToppingCount(); counter++)
        {
          System.out.println(pizza.getTopping(counter).getToppingName() + 
            " " + "$" + pizza.getTopping(counter).getToppingCost());
        }
        System.out.println(" ");
    }
    
}
