public class CompFriend implements Friend{

    private String name;
    private String depart;
    private String number;

    public CompFriend()
    {
        name = "";
        depart = "";
        number = "";
    }

    public CompFriend(String name, String depart, String number)
    {
        this.name = name;
        this.depart = depart;
        this.number = number;
    }

    public void show()
    {
        // super.show(); // 상위 클래스 Friend 의 show() 를 호출한다.
        System.out.println("number : " + number);
        System.out.println("Major : " + depart);
        System.out.println("name : " + name);
    }
}