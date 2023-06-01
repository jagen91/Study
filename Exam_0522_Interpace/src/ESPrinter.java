public class ESPrinter implements Printer{


    // 초기화
    @Override
    public boolean init()
    {
        System.out.println("EPSON inti");
        return true;
    }

    // 출력
    @Override
    public boolean printer(String doc)
    {
        System.out.println("EPSON print");
        return true;
    }

    // 중지
    @Override
    public void stop()
    {
        System.out.println("EPSON stop");
    }
}
