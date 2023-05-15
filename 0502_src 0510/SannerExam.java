import java.util.Scanner;

public class SannerExam {

    public static void main(String[] args) {

        // 키보드를 스캔하는 객체를 만들어준다.
        Scanner scan = new Scanner(System.in);

        // 키보드에서 엔터키입력까지 읽어온다.
        String inputStr = scan.nextLine();

        // 읽어온 문자열을 int 로 변환한다.
        int val = Integer.parseInt(inputStr);

        // 100을 더한 후 찍어준다.
        val = val + 100;
        System.out.println(val);

    }



}
