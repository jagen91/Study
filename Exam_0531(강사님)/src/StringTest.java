import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StringTest {

    public static void stringTest()
    {
        String orgMessage = "JAVA";

        byte[] arr1 = orgMessage.getBytes();

        String copyMessage = new String(arr1);

        System.out.println(copyMessage);

    }

    public static void stringBuilderTest()
    {
        String data = new StringBuilder().append("DEF").toString();
        System.out.println(data);
        
    }

    public static void stringTokenTest()
    {
        String data = "홍길동&이순신,박수홍";
        String[] dataTokens = data.split("&|,");

        StringTokenizer st = new StringTokenizer(data, "&|,");
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);

        }
        
    }

    public static void BoxingTest()
    {
        // 자바에서 제공하는 랩핑클래스(Wapper)를 사용하면
        // 연산을 다양하고 편하게 사용할수 있는 장점이 있다.
        
        // Boxing : 리터럴값을 래퍼에 저장하기 위한 문법
        Integer i = 10;     

        // Unboxing : 래퍼안의 값을 프리미티브 타입에 저장하기 위한 문법
        int k = i + 40;

        System.out.println(k);
    }

    public static void DataFormatTest()
    {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        
        System.out.println(sdf.format(now));

        System.out.println(now.getClass());


    }

    public static void CloneTest()
    {
        Student st1 = new Student("jsh", 1);

        st1.setScore(new int[]{80, 90, 100});



        Student st2 = null;
        
        try 
        {
            st2 = (Student)st1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println(st1);
        st1.setScore(20, 20, 20);

        System.out.println(st2);

        


    }



}
