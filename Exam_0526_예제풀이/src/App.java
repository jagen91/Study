import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        // Path file = Paths.get("c:\\AAA\\test.txt");
        // // resource는 AutoCloseable인터페이스를 구현한 리소스만 가능.

        // // try with resources 자원과 함께 지원하다?
        // try(BufferedWriter writer = Files.newBufferedWriter(file))
        // {

        //     writer.write("A");
        //     writer.write("B");
        // }
        // catch (IOException e)
        // {
        //     e.printStackTrace();
        // }

//////////////////////////////////////////////////////////


        String[] strArray = {"10", "2a"};

        int value = 0;

        for(int i = 0; i <= 2; i++)
        {
            try
            {           //문자열을 Int로 바꾸겠다
                value = Integer.parseInt(strArray[i]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("인덱스를 초과했음");
            }
            catch (NumberFormatException e)
            {
                System.out.println("숫자로 변환할 수 없음");
            }
            finally
            {
                System.out.println(value);
            }
        }

///////////////////////////////////////////////////////////////


    }
}
