public class App {
    public static void main(String[] args) throws Exception {
        Box<Toy> tbox = new Box<>();
        Box<RobotToy> rbox = new Box<>();


        BoxHandler.pushBox(tbox, new Toy());
        BoxHandler.pushBox(rbox, new RobotToy());






    }
}
