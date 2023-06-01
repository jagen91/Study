public class App {
    public static void main(String[] args) throws Exception {
        ListContainer lc = new ListContainer();

        Node node = new Node(1, "abc");
        lc.insertNode(node, Node.START_POS);
        lc.insertNode(node, Node.END_POS);
        lc.insertNode(node, 3);

        lc.insertNode(12, "abc", Node.START_POS );

    }
}
