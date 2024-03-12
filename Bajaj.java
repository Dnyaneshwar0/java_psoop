import java.util.Scanner;

class Bajaj extends Bike
{
	String maketype;

    void getDetails(Scanner k)
    {
        System.out.println("Enter Bajaj Bike Maketype :");
        maketype=k.next();
        super.getDetails(k);
    }

    void display()
    {
        System.out.println("\n--Displaying Details--");
        System.out.println("Bajaj Bike Maketype : "+maketype);
        super.display();
    }
}