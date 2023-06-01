public class WrongPasswordException extends Exception {
    public WrongPasswordException()
    {
        super("Password가 틀립니다.");
    }
    public WrongPasswordException(String message)
    {
        super(message);
    }

}
