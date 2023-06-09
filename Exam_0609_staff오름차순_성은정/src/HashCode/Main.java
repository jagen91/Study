package HashCode;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        // 1. Student Class 완성
        // 2. 10명의 학생을 set에 입력
        // 3. iterator을 이용해서 출력

        HashSet<Student> set = new HashSet<>();

        set.add(new Student(123, "성은정", "신내", "반장"));
        set.add(new Student(1234, "김미주", "중화", "반장"));

        Iterator<Student> iter = set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next().toString());
        }

        System.out.println(set.size());

        // for(Student s : set)
        // {
        //     s.print();
        // }
    }
}
