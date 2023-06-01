public class App {
    public static void main(String[] args) throws Exception {
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(10));
        lc.insertNode(new Node(20));
        lc.insertNode(new Node(30));

        lc.printAll();



        
    }
}
