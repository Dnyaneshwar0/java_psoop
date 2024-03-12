import java.util.Scanner;

class Audi extends Car
{
	String model;

    void getDetails(Scanner k)
    {
        System.out.println("Enter Audi Car Model :");
        model=k.next();
        super.getDetails(k);
    }

    void display()
    {
        System.out.println("\n--Displaying Details--");
        System.out.println("Audi Car Model : "+model);
        super.display();
    }
}