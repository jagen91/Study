import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        TreeSet<Integer> tree = new TreeSet<>();    // 정렬
        // Set<Integer> tree = new HashSet<>();     // 랜덤

        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);

        System.out.println("tree 사이즈 : " + tree.size());

        System.out.println("--------------------------------");
        Iterator<Integer> iter = tree.iterator();

        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

    }
}
