
// 계산을 사용하는 사람 클래스.
public class Person {
    public void action(Calcuable calcuable)
    {
        double result = calcuable.calc(10.2, 2.0);
        System.out.println("Result : " + result);

    }
    
}
