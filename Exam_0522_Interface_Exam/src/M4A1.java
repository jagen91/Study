public class M4A1 implements Gun {
    
    @Override
    public boolean caliber()
    {
        System.out.println("탄약구경 : 5.56mm");
        return true;
    }

    @Override
    public boolean type()
    {
        System.out.println("총기타입 : 자동소총");
        return true;
    }
}
