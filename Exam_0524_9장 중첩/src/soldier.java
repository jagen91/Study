public class soldier {

    class MachineGun
    {
        public int bullet;
        public int damage;
        
        public MachineGun()
        {
            bullet = 10;
            damage = 100;
        }
    }

    public MachineGun mGun;

    public soldier()
    {
        mGun = new MachineGun();
    }

    public void shotAll()
    {
        int bullet = mGun.bullet;

        for (int i = 0; i < bullet; i++)
        {
            System.out.println("데미지 : " + mGun.damage);
            mGun.damage = mGun.damage + mGun.damage;
            mGun.bullet--;
        }

        System.out.println("총알수 : " + mGun.bullet);

    }
}
