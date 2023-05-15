public class OperatorExam {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.0f;
        short k = 10;
        long l = 10L;

        // 1. 사칙연산 지원
        // 2. 단항 연산자 전위, 후위
        // 3. 나머지 연산자 %
        // 4. 비교 연산 (==, !=, >, <, <=, >=, &&, ||)  (없음 === 은 ==)
        // 5. 비트연산자 --> 공부X 안씀
        // 6. 대입연산자 +=, -=

        // ++a;  a++; 같음 뭐 없이 이거만 있으면

        // int k = a++;
        // // ↑ ↓ 같은 코드
        // int k = a;
        // a = a +1;
        
//////////////////////////////////////////////
    if (a == b)
    {
        System.out.println("a와 K는 같다");
    }

//////////////////////////////////////////////
    switch (k) {
        case 10:
            System.out.println("a = 10");
            break;
    
        default:
            System.out.println("nope");
            break;
    }    

////////////////////////////////////////////
    for (int i = 0; i < 10; i++)
    {
        System.out.println("abc");
    }
//////////////////////////////////////////
    int i = 0;

    while (i < 10) {
    System.out.println(i);
    i++;        
    }




    }
}