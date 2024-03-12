import java.util.Scanner;

class Car extends Vehicle
{
	double owncost;
	int warranty;
	int seatcap;
	String fuel;

    void getDetails(Scanner k)
    {
        System.out.println("Enter Ownership Cost:");
        owncost=k.nextDouble();
        System.out.println("Enter number of years in Warranty:");
        warranty=k.nextInt();
        System.out.println("Enter seating capacity:");
        seatcap=k.nextInt();
        System.out.println("Enter fuel type (Petrol/Diesel):");
        fuel=k.next();
        System.out.println("Enter Mileage:");
        mileage=k.nextInt();
        System.out.println("Enter Price:");
        price=k.nextDouble();
    }
    
    void display()
    {
        System.out.println("Ownership Cost: "+owncost);
        System.out.println("Number of years in Warranty: "+warranty);
        System.out.println("Seating capacity: "+seatcap);
        System.out.println("Fuel type (Petrol/Diesel): "+fuel);
        System.out.println("Mileage: "+mileage);
        System.out.println("Price: "+price);
    }
}