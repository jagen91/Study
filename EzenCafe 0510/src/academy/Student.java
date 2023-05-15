package academy;

public class Student {

    public String name;        // 이름
    public String school;      // 학교
    public int grade;          // 학년

    // 생성자
    //      1. 기본생성자는 무조건 만들어준다.
    //      2. 활용도에 따라 오버로딩된 생성자를 만들어준다.
    //      3. 아무런 생성자가 없는 경우, 자바는 기본생성자를
    //          자동으로 만들어 넣어준다.

    // 기본생성자
    public Student()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
        name = "";
        school = "";
        grade = 0;
    
    }

    // 오버로딩(Overloading) 생성자
    // 오버로딩 : 함수 호출시 함수의 이름과 파라미터 정보를
    //            복합적으로 해석해서 호출하는 기법.
    public Student(String name, String school, int grade)
    {
        System.out.println("OVERLOADED CONSTRUCTOR");
        this.name = name;
        this.school = school;
        this.grade = grade;
    
    }

    public void setGrade(int grade)
    {
        this.grade = grade;

    }

    public int getGrade()
    {
        return grade;
    }

}
