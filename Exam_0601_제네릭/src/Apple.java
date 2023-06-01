public class Apple implements Eatable {

    @Override
    public void eat()
    {
        System.out.println("eating Apple");
    }


    @Override
    public String toString()
    {
        return "I am an Apple.";
    }
}
