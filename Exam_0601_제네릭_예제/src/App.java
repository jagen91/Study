public class App {
    public static void main(String[] args) throws Exception {
    Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();
    Box<Double> box3 = new Box<>();

    
    box1.content = "안녕하세요";
    String str = box1.content;
    
    box2.content = 1991;
    int value = box2.content;

    box3.content = 3.3;
    double value2 = box3.content;

    System.out.println(str);
    System.out.println(value);
    System.out.println(value2);

    }
}
