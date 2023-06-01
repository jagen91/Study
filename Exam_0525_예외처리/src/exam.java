import java.util.Scanner;

public class exam {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int input2 = 0;
        boolean isValidInput = false;

        while (!isValidInput) 
        {
            System.out.println("숫자를 입력하세요 : ");
            String inputString = scan.nextLine();
            String inputString2 = scan.nextLine();
            try
            {
                input = Integer.parseInt(inputString);
                input2 = Integer.parseInt(inputString2);
                isValidInput = true;
            }
            catch (NumberFormatException excp)
            {

            }
        }
        System.out.println("Result : " + (input / input2));
    }
}
