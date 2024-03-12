import java.util.Scanner;

class TVS extends Bike
{
	String maketype;
    
    void getDetails(Scanner k)
    {
        System.out.println("Enter TVS Bike Maketype :");
        maketype=k.next();
        super.getDetails(k);
    }

    void display()
    {
        System.out.println("\n--Displaying Details--");
        System.out.println("TVS Bike Maketype : "+maketype);
        super.display();
    }
}