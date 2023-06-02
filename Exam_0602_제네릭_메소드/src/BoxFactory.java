public class BoxFactory {

    static int count;

    public static <T extends Number> Box<T> makeBox(T obj)
    {
        Box<T> box = new Box<>();
        box.set(obj);

        BoxFactory.count++;
        return box;
    }


    public int getCount()
    {
        return BoxFactory.count;
    }
}
