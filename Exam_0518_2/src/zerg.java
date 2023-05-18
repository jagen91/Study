public class zerg extends Unit{
    @Override
    public void Attack()
    {
        System.out.println("공격 : 퉤퉤");
    }

    public void move(int speed)
    {
        System.out.println("걷기 속도 : " + speed);
    }

}
