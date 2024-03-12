import java.util.Scanner;

class Bike extends Vehicle
{
	int numcyl;
	int numgear;
	String cooltype;
	String wheeltype;
	int ftanksize;

    void getDetails(Scanner k)
    {
        System.out.println("Enter Number of Cylinders:");
        numcyl=k.nextInt();
        System.out.println("Enter Number of Gears:");
        numgear=k.nextInt();
        System.out.println("Enter Cooling Type (air/liquid/oil):");
        cooltype=k.next();
        System.out.println("Enter Wheel type (alloys/spokes):");
        wheeltype=k.next();
        System.out.println("Enter Fuel tank size (inches):");
        ftanksize=k.nextInt();
        System.out.println("Enter Mileage:");
        mileage=k.nextInt();
        System.out.println("Enter Price:");
        price=k.nextDouble();
    }
    
    void display()
    {
        System.out.println("Number of Cylinders: "+numcyl);
        System.out.println("Number of Gears: "+numgear);
        System.out.println("Cooling Type: "+cooltype);
        System.out.println("Wheel type: "+wheeltype);
        System.out.println("Fuel tank size: "+ftanksize);
        System.out.println("Mileage: "+mileage);
        System.out.println("Price: "+price);
    }
}