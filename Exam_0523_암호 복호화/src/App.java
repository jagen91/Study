import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        Code_Small codea = new Code_Small();
        Code_Big codeaa = new Code_Big();

        System.out.println("암호를 입력하시오");
        System.out.println("> ");

        String input = scan.nextLine();
        codea.small(input);
        codeaa.big(input);
    }
}
