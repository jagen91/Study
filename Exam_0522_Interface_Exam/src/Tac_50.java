public class Tac_50 implements Gun {
    
    @Override
    public boolean caliber()
    {
        System.out.println("탄약구경 : 12.7mm");
        return true;
    }

    @Override
    public boolean type()
    {
        System.out.println("총기타입 : 저격총");
        return true;
    }
}

