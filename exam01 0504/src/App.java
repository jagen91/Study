public class App {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle();
        c2.setRadius(5);


        System.out.println(c1.getCircum());
        System.out.println(c1.getSize());
        
        System.out.println(c2.getCircum());
        System.out.println(c2.getSize());
        

        // 컨스트럭트 = 생성자  자바는 컨스트럭트가 없을때 디폴트 컨스트럭트가 있음
        // () = 생성자


        // 1. Gugudan 객체를 heap에 생성해라.
        // 2. Gugudan() 생성자를 호출해라.
        // 3. Gugudan 객체의 참조값을 gu 에 저장해라.

        // Gugudan gu = new Gugudan();
        // gu.printDan();


        // 1. Gugudan 객체를 heap에 생성해라.
        // 2. Gugudan() 생성자를 호출해라.
        // 3. Gugudan 객체의 참조값을 임시 참조변수 에 저장해라.

        // new Gugudan();
    }
}
