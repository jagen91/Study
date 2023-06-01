public class LGPrinter implements Printer {

    // 초기화
    @Override
    public boolean init()
    {
        System.out.println("LG init");
        return true;
    }

    // 출력
    @Override
    public boolean printer(String doc)
    {
        System.out.println("LG printer");
        return true;
    }

    // 중지
    @Override
    public void stop()
    {
        System.out.println("LG stop");
    }
    
}
