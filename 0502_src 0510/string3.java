public class string3 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        // index 0 부터 6 전까지
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        // index 7 부터 끝까지
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);


/////////////////////////////////////////////////////////////


        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if(location != -1)
        {
            System.out.println("자바와 관련된 책이군요.");
        }
        else
        {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if(result)
        {
            System.out.println("자바와 관련된 책이군요.");
        }
        else
        {
            System.out.println("자바와 관련 없는 책이군요.");
        }

//////////////////////////////////////////////////////////////////////


        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        
        //문자열 분리
        String[] tokens = board.split(",");

        //인덱스별로 읽기
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();

        //for 문을 이용한 읽기
        for(int i = 0; i < tokens.length; i++)
        {
            System.out.println(tokens[i]);
        }


//////////////////////////////////////////////////////////////////////////

        String[] strArray = new String[]
        {
            new String("권태현"),
            new String("권태현1"),
            new String("권태현2"),
            new String("권태현3"),
            new String("권태현4")
        };

        for (int i = 0; i < strArray.length; i++) 
        {
            System.out.println(strArray[i]);    
        }

//////////////////////////////////////////////////////////////////////


        int[] scores = {80, 90, 70, 70, 80};
        int total = 0;

        for (int sc : scores)
        {
            total = total + sc;
        }

        System.out.println(total);

/////////////////////////////////////////////////////////////////

    }
}
