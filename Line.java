public class Line	//Line class to demonstrate constructor overloading
{
    double m;
    double c;
    double x1,x2,y1,y2;
    
    Line(double m,  double c) //slope-yint form equation of line
    {
        this.m=m;
        this.c=c;
        System.out.println("Equation: y = "+m+"x "+c);
    }

    Line(double m, double x1, double y1) //slope point form equation of line
    {
        this.m=m;
        this.x1=x1;
        this.y1=y1;
        
        System.out.println("Equation: y - ("+y1+") = ( "+m+" )( x - "+x1+" )");
    }

    Line(double x1, double x2, double y1, double y2) //two point form equation of line
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        
        System.out.println("Equation: ( y - "+y1+" ) / ( "+y2+" - "+y1+" ) = ( x - "+x1+" ) / ( "+x2+" - "+x1+" )");
    }
    
}
