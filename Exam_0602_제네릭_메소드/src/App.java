public class App {

    public static <T extends Number> void swqpBox(Box<T> box1, Box<T> box2)
    {
        Box<T> box3 = BoxFactory.makeBox(null);

        box3.set(box1.get());
        box1.set(box2.get());
        box2.set(box3.get());
    }

    public static void main(String[] args) throws Exception {
        // Box<String> box = BoxFactory.<String>makeBox(new String("abc"));
        // Box<String> box = BoxFactory.makeBox(new String("abc"));
        // BoxFactory.makeBox(new String("abc"));
        // 3가지 같음


        Box<Integer> box1 = BoxFactory.makeBox(10);
        Box<Integer> box2 = BoxFactory.makeBox(20);




    }
}