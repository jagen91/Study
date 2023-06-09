package TreeSet;

import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        
        // TreeSet<Student> tSet = new TreeSet<>();

        // tSet.add(new Student(1, "박지은"));
        // tSet.add(new Student(2, "이지우", "서울", "leader"));
        // tSet.add(new Student(3, "박연수", "서울", "staff"));
        // tSet.add(new Student(4, "김성현", "서울", ""));
        // tSet.add(new Student(5, "박수현", "서울", ""));
        
        // System.out.println(tSet.size());

        // Iterator<Student> iter = tSet.iterator();

        // while(iter.hasNext())
        // {
        //     System.out.println(iter.next());
        // }



        Student[] ar = new Student[]
        {
            new Student(3, "박연수", "서울", "staff"),  // 1
            new Student(1, "박지은", "서울", "leader"), // -1
            new Student(8, "홍길동", "서울", ""),
            new Student(2, "이지우", "서울", "leader"),
            new Student(7, "민동기", "서울", "staff"),
            new Student(6, "최이서", "서울", "leader"),
            new Student(5, "박수현", "서울", "staff"),
            new Student(4, "김성현", "서울", ""),
            new Student(9, "김철수", "서울", ""),
        };

        System.out.println(ar[0].getTarget());
        System.out.println(ar[1].getTarget());

        Arrays.sort(ar);

        for(int i = 0; i < ar.length; i++)
        {
            System.out.printf("%d %s %s\n", ar[i].getNum(), ar[i].getName(), ar[i].getStaff());
        }
    }
}
