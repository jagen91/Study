public class Circle {
    
    public static double pi = 3.14;
    public double radius;

    public double getSize()
    {
        return radius * radius * Circle.pi;
    }


    public double getCircum(double radius)
    {
        return 2 * radius * Circle.pi;
    }




}
