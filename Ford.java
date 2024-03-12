import java.util.Scanner;

class Ford extends Car
{
	String model;
    
    void getDetails(Scanner k)
    {
        System.out.println("Enter Ford Car Model :");
        model=k.next();
        super.getDetails(k);
    }

    void display()
    {
        System.out.println("\n--Displaying Details--");
        System.out.println("Ford Car Model : "+model);
        super.display();
    }
}