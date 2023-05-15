public class Gugudan {
    
    // private == 공구리 못들어오게 막음 
    private int dan;

    // Default constructor = 기본 생성자
    public Gugudan()
    {
        System.out.println("Constructor 호출");
        dan = 0;
    }

    // Overloaded Constructor
    public Gugudan(int dan)
    {
        System.out.println("Overloaded Constructor 호출");
        this.dan = dan;
    }

    // 정상적으로 쓰는방법
    public void setDan(int dan)
    {
        this.dan = dan;
    }

        // 정상적으로 읽는방법
    public int getDan()
    {
        return dan;
    }

    public void printDan()
    {
        int m = 1;
        for (int i = 0; i < 9; i++)
        {
            System.out.printf("%d x %d = %d\n", dan, m, dan * m);
            m++;
        }
    }

}
