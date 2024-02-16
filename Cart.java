public class Cart 
{
    double carts[][][]=new double[3][2][];

    void getCost()    //Method to return total cost of cart
    {
        double amt=0;

        for(double cart[][]:carts)
        {
            for(double type[]:cart)
            {
                for(double price:type)
                {
                    amt+=price;
                }
            }
        }
        System.out.println("Total Amount: "+ amt);
    }

    void perishNum() //Method to get total number of perishable items on all carts
    {
        int c=0;
        for(double i[][]:carts)
        {
            c+=i[0].length;    //adds number of elements in first 1D array of each 2D array, representing a single cart, since the first array represents perishable items in all the carts
        }
        System.out.println("Total number of Perishable items: "+c);
    }

    void maxCost()    //Method to return cost of most expensive non-perishable item
    {
        double max=0;
        for(double i[][]:carts)
        {
            for(int j=0;j<i[1].length;j++)  //to loop through the 1D array placed in index 1, where costs of non-perishable items are stored, of each 2D array representing a cart
            {
                if(i[1][j]>max)
                {
                    max=i[1][j];
                }
            }
        }
        System.out.println("The most expensive item cost: "+max);
    }
}
