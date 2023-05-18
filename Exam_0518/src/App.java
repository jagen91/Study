public class App {
    public static void main(String[] args) throws Exception {
        SmartTV stv = new SmartTV();

        stv.PowerOn();
        stv.startNetflex();
        

        TV tv = new SmartTV();
        tv.PowerOn();
        tv.changeChannel(11);
        System.out.println(tv.getChannel());



    }
}
