import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("1. EPSON | 2. HP | 3. Samsung | 4. LG");
        System.out.println("프린터를 입력하세요 >");

        int type = scan.nextInt();
        Printer prn = null;

        switch (type)
        {
            case 1:
                prn = new ESPrinter();
            break;

            case 2:
                prn = new HPPrinter();
            break;

            case 3:
                prn = new SSPrinter();
            break;

            case 4:
                prn = new LGPrinter();
            break;
        }

        prn.init();
        prn.stop();
    }
}