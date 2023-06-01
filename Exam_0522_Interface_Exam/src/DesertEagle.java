public class DesertEagle implements Gun {
    
    @Override
    public boolean caliber()
    {
        System.out.println("탄약구경 : 13.7mm");
        return true;
    }

    @Override
    public boolean type()
    {
        System.out.println("총기타입 : 자동권총");
        return true;
    }
}
