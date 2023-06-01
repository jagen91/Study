public class NoExistIDException extends Exception{
    public NoExistIDException()
    {
        super("id가 존재하지 않습니다.");
    }
    public NoExistIDException(String message)
    {
        super(message);
    }

}
