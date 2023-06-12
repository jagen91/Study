import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // 유니크, 정렬, 찾기 등을 하기 위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>(new StringCompare());

        tSet.add(new Person(60, "최영"));
        tSet.add(new Person(20, "홍길동"));
        tSet.add(new Person(40, "이순신"));
        
        for (Person p : tSet)
        {
            System.out.println(p);
        }

    }
}
