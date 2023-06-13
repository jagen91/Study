public class App {

    public static void printDocument(int a, String s)
    {
        System.out.println(a);
        System.out.println(s);

    }



    public static void main(String[] args) throws Exception {
        Printer prn1 = new Printer();
        Printable prn2 = new Printer();

        App.printDocument(4, "abd");

        // 익명 객체 Anonimous  : 인터페이스 구현의 의미
        Printable prn3 = new Printable()
        {   @Override
            public void print(String str)
            {
                System.out.println("출력물 : " + str);
            }
        };

        // 익명 객체 Anonimous  : Printer클래스를 재정의 의미 => 잘 안씀
        Printable prn4 = new Printer()
        {
            @Override
            public void print(String str)
            {
                System.out.println("출력물 : " + str);
            }
        };

        // 한줄인 경우{}를 생략 할 수 있다.

        Printable prn5 = (str) -> System.out.println("람다식 : " + str);
        

        // 파라미터가 여러개인 경우 {}여러개 가능
        Scanable scan1 = (dpi, bColor)->
        {
            System.out.println("dpi : " + dpi);
            System.out.println("bColor : " + bColor);            
        };

        // 파라미터가 없는경우.
        Terminatable tmt = ()->System.out.println("Stop");

        // 리턴값이 있는 경우의 람다식 표현

        Addable add1 = (a, b)->{return a + b; };
        int c = add1.add(10, 20);

        Addable add2 = (a, b)-> a + b;
        c = add2.add(10, 20);


        prn1.print("Printer");
        prn2.print("Printable");
        prn3.print("Anonimous Printable");
        prn4.print("Anonimous Printer");
        prn5.print("lamda expression");

        // 실제로는 객체 인데, 표현은 마치 생략된 함수처럼 표현하는 방식
        // --> 람다 표현식(lamda expression) 람다식.
        // 람다식은 클래스 구현을 편리하게 하기위한 목적.
        // 람다식은 메소드가 하나인 인터페이스를 기반


    }
}
