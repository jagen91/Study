public class App {
    public static void main(String[] args) throws Exception {
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Integer> result = new Box<>();

        box1.set(30);
        box2.set(20);

        WildcardExam.addBox(box1, box2, result);

        System.out.println(result.get());
    }
}
