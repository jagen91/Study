public class Protoss extends Unit{

    public void Attack()
    {
        System.out.println("공격 : 슉슉");
    }

    public void move(int speed)
    {
        System.out.println("뛰기 속도 : " + (speed * 2));
    }

}
