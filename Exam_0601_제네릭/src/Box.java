public class Box<T extends Number> {
    // <> diamond  " T " = Type parameters, template parameters
    private T fruit;

    public Box()
    {
        fruit = null;
    }

    public Box(T fruit)
    {
        this.fruit = fruit;
    }

    public void set(T fruit)
    {
        this.fruit = fruit;
    }

    public T get()
    {
        return fruit;
    }

    @Override
    public String toString()
    {
        return fruit.toString();
    }

    public int getIntValue()
    {
        return fruit.intValue();
    }





}
