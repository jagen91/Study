public class SmartPhone extends Phone {
    public String model;


    // 중복된 필드 (어트리뷰트)는 잘못 설계된 코드이다.
    public SmartPhone()
    {
        System.out.println("SmartPhone-Constructor");
    }

    public SmartPhone(String model, String color)
    {
        // 상위 클래스의 초기화 즉, 생성자를 명시적으로 호출
        // 상위 클래스의 생성자는 항상 제일 앞에 두어야 한다.
        super(model, color);     

        System.out.println("SmartPhone-overloaded Constructor");
    }

    // 오버라이딩.
    @Override
    public void ring()
    {
        System.out.println("뉴진스 음악");
    }

}
