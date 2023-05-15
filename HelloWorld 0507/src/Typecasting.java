public class Typecasting {
    public static void main(String[] args) {
        // 형변환 (type casting)
        // 자료형을 다른 자료형으로 변환.

        // 명시적 캐스팅 (explicit type casting)
        int v_int  = 10;
        short v_sho = (short)v_int;

        System.out.println(v_sho);


        short s1 = 1200;
        int i1 = s1;
        System.out.println(i1);


        float f1 = 3.14f;
        int ii = (int)f1;
        System.out.println(ii);

        int fff = 4;
        float ef = fff;
        System.out.println(ef);

    }
    
}
