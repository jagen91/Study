package Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rect = null;
        
        try
        {
            // 객체 생성시 잘못된 point값을 넣으면 예외 발생!
            rect = new Rectangle(90, 10, 10, 100);
        }
        catch(WrongPointException e)
        {
            e.printStackTrace();
            return;

        }
        
        
    }
}
