public class App {
    public static void main(String[] args) throws Exception {

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);


    }
}
