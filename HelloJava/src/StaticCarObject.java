
/**
 * Creating Objects with Nested Class and Understanding the Scope of variables
 * @author D
 *
 */

class Car
{ 
    // static number (of cars)
    static int number_of_cars = 30;
    
    //non-static number (of employes)
    int number_of_employees = 40;
    
    // private member (name of Company)
    private static String companyName = "Kitchner Toyata Dealer";
    
    // static nested class
    static class Toyata
    {
        void myCarDetails()
        {
            // can access static member (of Car class)
            System.out.println("Number of Cars = " + number_of_cars);
            
            // can access private static member (of Car Class)
            System.out.println("Name of the Company = " + companyName);
            
            /**
             * Static nested class cannot access non-static members (number of employees)
             * Compilation Error will occur if enabled the following
             */
            // System.out.println("Number of Employees = " + number_of_employees);
        }
    }
    
    class Lexus
    {
        void myCarDetails()
        {
            // can access static member (of Car class)
            System.out.println("Number of Cars = " + number_of_cars);
            
            // can access private static member (of Car Class)
            System.out.println("Name of the Company = " + companyName);
            
            /**
             * Non-static nested class can access non-static members (number of employees)
             *
             */
             System.out.println("Number of Employees = " + number_of_employees);
        }
    }
}

// Main class
public class StaticCarObject
{
    public static void main(String[] args)
    {
        System.out.println("Accessing and creating an object from static nested class");
    	Car.Toyata newToyata= new Car.Toyata();
    	newToyata.myCarDetails();
    	
    	//Cannot create object directly from static class
    	//Toyata anotherToyata = new Toyata();
    	
        System.out.println("\nAccessing and creating objects from inner class Lexus");
    	Car generalCar = new Car();
    	Car.Lexus myLexus = generalCar.new Lexus();
    	
    	myLexus.myCarDetails();
    }
}
