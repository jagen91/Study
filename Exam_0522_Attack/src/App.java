public class App {
    public static void main(String[] args) throws Exception {
        
        Unit[] units = new Unit[]{
            new Tank(), new Tank(), new Tank(),
            new Fighter(), new Fighter(),
        };

        for (int i = 0; i < units.length; i++) {
            units[i].attack();
        }
    }
}
