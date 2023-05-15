package accont;
public class App 
{
    public static void main(String[] args) 
    {
        Account[] acs = new Account[100];

        for (int i = 0 ; i < acs.length; i++)
        {
            acs[i] = new Account();
        }

    }
}