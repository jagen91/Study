import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        // 1. Student클래스를 완성.
        // 2. 10명의 학생을 set에 입력
        // 3. iterator 이용해서 이쁘게 출력

////////////////////////////////////////////////////////////////////////////////////
        Student[] ar = new Student[]
        {
            new Student(6, "정재근 ", "서울", " staff"),
            new Student(5, "김성현 ", "서울", " staff"),
            new Student(4, "민동기 ", "서울", ""),
            new Student(1, "권태현 ", "서울", ""),
            new Student(2, "김재운 ", "서울", ""),
            new Student(3, "박지은 ", "서울", " leader"),
            new Student(7, "성은정 ", "서울", ""),
            new Student(9, "박연수 ", "서울", ""),
            new Student(8, "김동욱 ", "서울", ""),
            new Student(0, "박수현 ", "서울", "")
        };

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) 
        {
            System.out.printf("%d %s %s \n", ar[i].getNumber(), ar[i].getName(), ar[i].getStaff());
        }

//////////////////////////////////////////////////////////////////////////////

        //  TreeSet<Student> set = new TreeSet<>();

        // set.add(new Student("정재근 ", "서울 ", 4 , ""));
        // set.add(new Student("김성현 ", "서울 ", 8 , " staff"));
        // set.add(new Student("민동기 ", "서울 ", 3 , ""));
        // set.add(new Student("권태현 ", "서울 ", 1 , ""));
        // set.add(new Student("김재운 ", "서울 ", 5 , ""));
        // set.add(new Student("박지은 ", "서울 ", 6 , " leader"));
        // set.add(new Student("성은정 ", "서울 ", 7 , ""));
        // set.add(new Student("박연수 ", "서울 ", 2 , ""));
        // set.add(new Student("김동욱 ", "서울 ", 9 , ""));
        // set.add(new Student("박수현 ", "서울 ", 10 , ""));


        // System.out.println(set.size());


        // System.out.println("--------------------------------");

        // Iterator<Student> iter = set.iterator();
        // while (iter.hasNext())
        // {
        //     System.out.println(iter.next());
        // }











///////////////////////////////////////////////////////////////////////////////////////////

        // String a = new String("abc");
        // String b = new String("fdbc");

        // System.out.println(b.hashCode());
        // System.out.println(a.hashCode());


///////////////////////////////////////////////////////////////////////////////////////////


        // Set<String> set = new HashSet<String>();
        
        // set.add("abc");
        // set.add("def");
        // set.add("opq");

        // System.out.println(set.size());

        // set.add("abc"); // 추가가 안될것이라고 예상.(set은 중복X)

        // System.out.println(set.size());

        // Iterator<String> iter = set.iterator();

        // System.out.println("------------------------");
        // while(iter.hasNext())
        // {
        //     System.out.println(iter.next());
        // }
    }
}
