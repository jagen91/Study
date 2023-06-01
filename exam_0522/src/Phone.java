public class Phone {

    public static String vendor = "삼성전자";
    public String model;    // 모델명
    public String color;    // 색상

    public Phone()
    {
        System.out.println("Phone-constructor");
    }

    public Phone(String model, String color)
    {
        this.model = model;
        this.color = color;
        System.out.println("Phone-overloaded constructor");
    }

    public void ring()
    {
        System.out.println("따르릉 따르릉");
    }
}