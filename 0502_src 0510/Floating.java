public class Floating {
    public static void main(String[] args) {
        // ■ 실수형은 float과 double 두 종류가 있습니다.
        // float : 4byte
        // double : 8byte

        // float인경우 postfix f를 붙여줍니다.
        float pi = 3.14f;
        float res = pi * 0.31f;
        System.out.println(pi);
        System.out.println(res);
        
        // 실수를 계산할때에는 float보다는 double을 사용한다.
        // 실수 연산에서 소숫점 이하 자리가 증가되기 때문에
        // float을 사용할경우 데이터의 유실이 일어날수 있기 때문이다.
        // double postfix를 생략
        double pi2 = 3.14;
        System.out.println(pi2);

    }
}
