public class UnivFriend implements Friend {
    
    private String name;
    private String major;
    private String number;

    public UnivFriend()
    {
        name = "";
        major = "";
        number = "";
    }

    public UnivFriend(String name, String major, String number)
    {
        this.name = name;
        this.major = major;
        this.number = number;
    }

    public void show()
    {
        System.out.println("Name : " + name);
        System.out.println("Major : " + major);
        System.out.println("number : " + number);
    }
}
