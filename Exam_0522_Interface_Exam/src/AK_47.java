public class AK_47 implements Gun {

    @Override
    public boolean caliber()
    {
        System.out.println("탄약구경 : 7.62mm");
        return true;
    }

    @Override
    public boolean type()
    {
        System.out.println("총기타입 : 자동소총");
        return true;
    }
}
