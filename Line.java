public class Line 
{
    double m;
    double c;
    double x1,x2,y1,y2;

    String eq;

    Line(double m,  double c) //slope-yint 
    {
        this.m=m;
        this.c=c;
        // if(m!=)
        x1=Math.random()*5;
        x2=Math.random()*5+5;

        y1=m*x1+c;
        y2=m*x2+c;
        
        //y=mx+c
    }

    Line(double m, double x1, double y1) //slope point
    {
        this.m=m;
        this.x1=x1;
        this.y1=y1;

        c=-m*x1+y1;
        x2=Math.random()*5+5;
        y2=m*(x2-x1)+y1;
        //y-y1=m(x-x1)
    }

    Line(double x1, double x2, double y1, double y2) //two point
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

        m=(y2-y1)/(x2-x1);
        c=(-x1/x2-x1)*(y2-y1)+y1;
        // m = (y2 - y1) / (x2 - x1)
        // y-y1/y2-y1=x-x1/x2-x1
    }
    
}
