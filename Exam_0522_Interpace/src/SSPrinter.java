public class SSPrinter implements Printer {

     // 초기화
    @Override
    public boolean init()
    {
        System.out.println("SS init");
        return true;
    }


     // 출력
    @Override
    public boolean printer(String doc)
    {
        System.out.println("SS Play");
        return true;
    }


     // 중지
    @Override
    public void stop()
    {
        System.out.println("SS stop");
    }

}
