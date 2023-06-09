package TreeSet;

import java.util.Objects;

public class Student implements Comparable<Student> {

    // Comparable interface
    // 비교하는 방법은 2가지가 있음
    // 첫 번재 방법 compareTo, 자기 자신과 파라미터로 들어오는 객체랑 비교하는 것
    // 두 번째 방법, 제 3자의 객체가 비교하는 거

    
    private String name;    // 이름
    private String address; // 주소
    private int num;        // 학번
    private String staff;   // 반장(leader), staff("staff") 일반학생은 ""


    // 기본 생성자
    public Student()
    {
        name = "";
        address = "";
        num = 0;
        staff = "";
    }

    // 오버로딩 생성자
    public Student(int num, String name, String address, String staff)
    {
        this.name = name;
        this. address = address;
        this.num = num;
        this.staff = staff;
    }

    // 중요 순서를 먼저! key가 될 만한거
    public Student(int num, String name)
    {
        this.name = name;
        this.num = num;
        address = "";
        staff = "";
    }


    // getter/setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStaff() {
        return this.staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public int getTarget()
    {

        if(this.staff.equals("leader"))
        {
            return -1;
        }
        else if(this.staff.equals("staff"))
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", num='" + getNum() + "'" +
            ", staff='" + getStaff() + "'" +
            "}";
    }

    @Override
    public int compareTo(Student stu)
    {
        // num을 기준으로 정렬
        // 작은 수의 number가 앞으로 갈건지, 큰 수의 number가 앞으로 갈건지 정해야함
        // 그래야 swap을 할 수 있음!
        // 1. this가 앞으로 가는 경우 ==> 음수를 return
        // 2. 파라미터가 앞으로 경우 ==> 양수를 return
        // 3. this와 파라미터가 같아서 swap할 필요가 없음

        // 기존의 num은 this.num, 새로 들어온 num은 stu.num
        // 오름차순으로 정렬을 하려고 한다
        /*
        if(this.num > stu.num)
        {
            // 양수
            return 1;
        }
        else if(this.num < stu.num)
        {
            // 음수
            return -1;
        }
        else    // else if (this.num == stu.num)
        {
            return 0;
        }
         */

        // this가 크다면 양수, 작으면 음수, 같으면 0이 나오기 때문에
        // return this.num - stu.num;

        return this.getTarget() - stu.getTarget();
    }


    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student)obj;
        

        if((this.name == student.name) && (this.num == student.num))
        {
            return true;
        }
        
        return false;

    }

    @Override
    public int hashCode()
    {
        // return name.hashCode() % 5;
        // 논리적으로 맞지가 않음, 이름만 가지고 x
        // 만약에 동명이인이라면?
        // 성은정 서울, 성은정 경기도, 서로 다른 데이터임

        // 방법1 : 데이터량이 많은 경우
        // return (name.hashCode() + address.hashCode()) % 5;

        // 방법2 : 데이터량이 적은 경우
        return Objects.hash(num);
        // Object 기능을 별도로 쓸 수 있는 객체 : Objects
        // 방법1과 같은 기능임
    }


}
