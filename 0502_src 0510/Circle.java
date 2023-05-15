public class Circle {
    private double pi = 3.14;
    private double radius;

    public Circle()
    {
        this.pi = 3.14;
        radius = 0;
    }

    public Circle(double radius)
    {
        this.pi = 3.14;
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public  double getRadius()
    {
        return radius;
    }

    public double getCircum()
    {
        return 2 * radius * pi;
    }

    public double getSize()
    {
        return radius * radius * pi;
    }
}
