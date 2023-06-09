import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new HashSet<>();

        set.add("abc");
        set.add("def");
        set.add("ghi");
        System.out.println(set.size());

        
        set.add("abc");
        System.out.println(set.size());     // set은 중복x 그래서 위와 동일한 size가 나옴

        Iterator<String> iter = set.iterator();


        System.out.println("---------------------");
        while(iter.hasNext())
        {
            // set은 순서가 없기 때문에 아무렇게 나옴, 대신 하나씩 나옴 순회가 가능하기 때문에
            System.out.println(iter.next());
        }


    }
}
