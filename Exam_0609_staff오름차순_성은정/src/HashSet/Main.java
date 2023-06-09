package HashSet;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        // System.out.println(new Num(10));

        HashSet<Num> set = new HashSet<>();

        set.add(new Num(45));
        set.add(new Num(23));
        set.add(new Num(634));
        set.add(new Num(3));

        set.add(new Num(45));   // 입력이 안 될 것이라는 예상, 중복

        System.out.println(set.size());     // 4를 예상하지만 5가 출력 됨

        // add를 할 때, equals를 해서 비교를 함, Object
        // equals를 재정의를 해주면 됨
        // equals를 재정의 했는데 다를게 없음. 왱?

        // // equals는 정상
        // Num n1 = new Num(10);
        // Num n2 = new Num(12);

        // System.out.println(n1.equals(n2));

        // hash도 재정의를 해줘야함, % 연산자로


        Iterator<Num> iter = set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println("----------");
        for(Num n : set)
        {
            System.out.println(n);
        }



    }
}
