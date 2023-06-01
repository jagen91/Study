import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int value1 = 0;
        int value2 = 0;
        boolean bSuccess = false;

        System.out.println("숫자를 입력해주세요.");

        do
        {
            try
            {
            value1 = scan.nextInt();
            value2 = scan.nextInt();

            bSuccess = true;
            }

            catch (java.util.InputMismatchException e)
            {
                scan.nextLine(); // 입력값 초기화  =  초기화 하지않으면 무한루프
                System.out.println("숫자를 입력해주세요.");
            }

        }while(bSuccess == false);

        scan.close();

        System.out.println("value1 =" + value1);
        System.out.println("value2 =" + value2);
    }
}
