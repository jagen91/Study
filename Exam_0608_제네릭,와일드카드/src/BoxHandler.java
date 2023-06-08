public class BoxHandler {

    //box의 Toy을 확인하는 함수 (box : reading)
    public static void popBox(Box<? extends Toy> box)
    {
        Toy t = box.get();
        System.out.println(t);

    }

    //box에 Toy을 넣는 함수. (box : writing)
    public static void pushBox(Box<? super Toy> box, Toy t)
    {
        box.set(t);
    }

    public static void pushBox(Box<? super RobotToy> box, RobotToy t)
    {
        box.set(t);
    }
}
