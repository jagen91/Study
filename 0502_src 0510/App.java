// ■ 클래스가 무조건 있어야 한다. 어플리케이션이란 클래스의 집합이다.
public class App {
    // ■ main() 함수는 어플리케이션의 시작점이며 반드시 1개만 존재.
    public static void main(String[] args) throws Exception {
        // ■ 주석
        // 주석을 붙이는 두가지 방식
        // 1. 라인주석 : // (슬래시 2개)  ==> Ctrl + /
        // 2. 블록주석 : /* */
        // 주로 블록주석은 사용하지 않습니다.
        
        // ■ 문장 (statement)의 끝은 반드시 ; 로 끝나야 한다.
        // JS는 붙이지 않는 경우 자동으로 붙여줬습니다만 자바는 그런거 없다.
        System.out.println("Hello, World!");


        // 미션 1 : 두 수를 더하는 코드를 구현해 봅시다.
        // 4byte 정수 (-21억 ~ + 21억)
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // 2byte 정수 (-32000 ~ +32000)
        short c = 10;
        short d = 30;
        System.out.println(c + d);

        // 1byte 정수 (-128 ~ +127)
        byte e = 0x10;
        byte f = 21;
        System.out.println(e + f);

        // 8byte정수 (64bit)
        long g = 10000000000L;
        long h = 2043040;
        System.out.println(g + h);

        // 두개의 수를 더할때 서로 타입이 다른경우,
        // 작은 타입을 큰 타입으로 묵시적 형변환(확장)을 수행하여 계산.
        int val1 = 20;
        long val2 = 30L;
        System.out.println(val1 + val2);

        // 리터럴.
        // 16진수의 경우 0x를 앞에 붙여준다. (prefix)
        // int 최대범위가 넘어가는경우 또는 작은 값이라도 long형의 경우 
        // L 이라는 postfix (suffix)를 붙여준다.


//////////////////////////////////////////////////////////////////

        Week today = Week.THURSDAY;

        System.out.println(today);

    }
}
