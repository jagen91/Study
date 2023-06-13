public class App {
    public static void main(String[] args) throws Exception {

        // 사람이 컴퓨터를 이용하여 두 수를 더하려고하는 코드.
        // 1. 주변정황을 추론, 람다식을 이용, 임시객체를 만들어내는 방법
        Person p1 = new Person();

        Calcuable cal1 = (a, b)->{ return Computer.calcAdd(a, b); };
        p1.action(cal1);

        //2. Computer클래스에 calcAdd함수를 니가 보자나?
        // 그러면 Calcuable 인터페이스를 구현한 임시객체를 만들수 있단다.
        Calcuable cal2 = Computer::calcAdd; 
        p1.action(cal2);

        //Computer com = new Computer();

        // 3. com객체의 calcMul()를 참고해서 임시객체를 만들수 있단다.
        p1.action(new Computer()::calcMul);

        
    }
}
