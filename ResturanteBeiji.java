import java.util.*;
/*
class InvalidArgumentException extends Exception 
{
    public InvalidArgumentException(String message)
    {
        super(message); 
    }
} */ 
Scanner input = new Scanner(System.in); // Scanner 
class Customer // 1:
{
    // Variables 
    private String name;
    private boolean above18;

    // Constructor 
    public Customer(String na, int a, boolean ab)
    {
        name = na;
        above18 = ab;
    }

    // Methods
    public void setName(String n) 
    {
        name = n;
    }
    public String getName() 
    {
        return name;
    }
    
    public void fillName() // Who is customer
    {
        String customerName = ""; 
        System.out.println("Enter your lastname:\n");
        customerName = input.nextLine(); 
        return customerName;
    }

    public boolean checkAlchohol() // Alcohol allowed or not
    {
        boolean alchohol = false; // Control
        boolean loop1 = true; // Loop 1 
        int alchTest = 0; // Loop 1 -- condition 
        System.out.println("Are you above 18 year old?\n:");

        while (loop1)
        {
            alchTest = input.nextInt();
            if (alchTest == 0)
            {
                alchohol = false;
                loop1 = false;
            }
            else if (alchTest == 1)
            {
                alchohol = true;
                loop1 = false;
            }
            else if (alchTest < 0 || alchTest > 1)
            {
                System.out.println("Wrong number. Try again.");
            }
        }  
    }

}

class Table // 2: Tables empty and not, and reserve
{
    int tableNumber;
    int seats;

}


public class ResturanteBeiji // Main - Procedure phase 
{
    public static void main(String[] args) 
    {
        // Customer phase
        String name = Customer.fillName();
        Boolean alcohol = Customer.checkAlchohol();
        Customer c = new Customer(name, alcohol);
        System.out.println("Your name is: " + Customer.getName() 
        + "\nCorrect?");

        // Table phase
        
        // Food (price list)

        // Bill

        // Rating
        
    }
}