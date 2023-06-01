public class App {
    public static void main(String[] args){
        
        Student stu1 = StudentFactory.makeStudent("jsh", 20);

        Student stu2 = new Student("abc", 0);

        System.out.println(stu1);
        
    }
}
