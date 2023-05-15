package transport;

public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    public Car()
    {
        company = "";
        model = "";
        color = "";
        maxSpeed = 0;
    }

    public Car(String company, String model, String color, int maxSpeed)
    {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getCompany()
    {
        return this.company;
    }

    public void setCompany(String company)
    {
        this.company = company;    
    }

    public String getModel() 
    {
        return this.model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getColor() 
    {
        return this.color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public int getMaxSpeed() 
    {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) 
    {
        this.maxSpeed = maxSpeed;
    }

    
}
