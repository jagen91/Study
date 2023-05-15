import transport.*;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Car avante = new Car("HD", "NORMAL", "red", 160);
        Car sonata = new Car("HD", "N-Line", "white", 200);

        System.out.println(avante.getCompany());
        System.out.println(avante.getColor());
        System.out.println(avante.getMaxSpeed());
        



    
    }
}
