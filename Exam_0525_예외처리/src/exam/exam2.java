package exam;
public class exam2 {

    public static void func2(int val1, int val2) throws ArithmeticException
    {
        System.out.println("func2 start");

        try{
        System.out.println("나누기 연산 : " + (val1 / val2));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("func2 end");
    }

    public static void func1(int val1, int val2) throws ArithmeticException
    {
        System.out.println("func1 start");

        func2(val1, val2);
        
        System.out.println("fuc1 end");
    }


    public static void main(String[] args) throws Exception, ArithmeticException
    {
    
        int val1 = 10;
        int val2 = 0;

        System.out.println("main start"); 
        try
        {
            func1(val1, val2); 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("main end");

    }
}
