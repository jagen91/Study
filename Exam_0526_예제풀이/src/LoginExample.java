public class LoginExample {
    public static void main(String[] args)
    {

        try
        {
            login("white", "12345");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            login("blue", "54321");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


        public static void login(String id, String password)
        throws NoExistIDException, WrongPasswordException
        {   // id가 blue가 아니라면 NoExistIDException을 발생
            if(!id.equals("blue"))
            {
                throw new NoExistIDException(id);
            }
            if(!password.equals("12345"))
            {
                throw new WrongPasswordException(password);
            }
        }
    }

