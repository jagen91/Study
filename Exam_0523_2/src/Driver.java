public class Driver {
    
    void drive (Vehicle vehicle)
    {
        if(vehicle instanceof Bus)
        {
            Bus bus = (Bus)vehicle;
            bus.busLamp();
        }
        else if(vehicle instanceof Taxi)
        {
            Taxi taxi = (Taxi)vehicle;
            taxi.check();

        }
        vehicle.run();
    }
}
