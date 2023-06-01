public class App {
    public static void main(String[] args) throws Exception {

        soldier s1 = new soldier();

        s1.shotAll();

        soldier.MachineGun gun = s1.new MachineGun();

    }
}
