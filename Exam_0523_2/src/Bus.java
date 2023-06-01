public class Bus implements Vehicle {
    
    @Override
    public void run()
    {
        System.out.println("버스가 달려요잉~");
    }

    public void busLamp()
    {
        System.out.println("비상등을 켭니다.");
    }
}
