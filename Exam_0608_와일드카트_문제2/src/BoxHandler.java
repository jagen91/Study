public class BoxHandler {
    public static <T> void checkBox(Box<? extends T> box)
    {
        T t = box.get();
        System.out.println(t);
    }

    public static <T> void inBox(Box<? super T> box, T ojb)
    {
        box.set(ojb);
    }

    public static <T> void moveBox(Box<? super T> to, Box<? extends T> from)
    {
        to.set(from.get());
    }

}
