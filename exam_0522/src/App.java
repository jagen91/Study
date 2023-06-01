public class App {
    public static void main(String[] args) throws Exception {
        SmartPhone smartPhone = new SmartPhone("model01", "black");

        // 상위 객체의 참조값으로 하위 객체를 참조할수 있다.
        Phone phone = new SmartPhone();


        // 오버라이딩 된경우 오버라딩된 함수가 호출된다.
        phone.ring();


    }
}
