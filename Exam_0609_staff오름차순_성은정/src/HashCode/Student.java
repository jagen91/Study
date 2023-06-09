package HashCode;

import java.util.Objects;

public class Student {
    
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
    public Student(int num, String name, String address)
    {
        this.name = name;
        this. address = address;
        this.num = num;
        this.staff = "일반 학생";
    }

    // 중요 순서를 먼저! key가 될 만한거!
    public Student(int num, String name, String address, String staff)
    {
        this.name = name;
        this. address = address;
        this.num = num;
        this.staff = staff;
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

    // public void print()
    // {
    //     System.out.printf("학번 : %d\t 이름 : %s\t 주소 : %s\t staff : %s\n", num, name, address, staff);
    // }

    @Override
    public String toString()
    {
        return "{ "+"name: "+getName()+
                " address: " + getAddress() + 
                " number: " + getNum() + 
                " staff: "+getStaff()+"}";
    }

    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student)obj;
        

        if(this.name == student.name)
        {
            return true;
        }
        if(this.address == student.address)
        {
            return true;
        }
        if(this.num == student.num)
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
