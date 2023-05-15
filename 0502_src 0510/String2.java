public class String2 {
    public static void main(String[] args) {

        String name1 = "이순신";

        String name2 = new String("이순신");

        String name3 = "이순신";

        String name4 = new String("이순신");


        System.out.println(name1);
        System.out.println(name2);

        // 중요 : == 은 프리미티브 타입 비교에만 쓰자.

       //기준        비교대상
        name1.equals(name2);

        if (name1.equals(name2))
        {
            System.out.println(("같다."));
        }
        else
        {
            System.out.println(("다르다."));
        }

        System.out.println(name1.charAt(1));
        System.out.println(name1.length());

    }
}
