import java.util.Objects;

public class Student implements Comparable<Student> {
    private String  name;       // 이름
    private String  address;    // 주소
    private int     number;     // 번호
    private String  staff;      // 반장(leader), sfatt( "staff")  일반학생은 ("")


    public Student()
    {
        name = "";
        address = "";
        number = 0;
        staff = "";
    }


    public Student(int number, String name, String address, String staff)
    {
        this.name = name;
        this.address = address;
        this.number = number;
        this.staff = staff;
    }

    public Student(int number, String name)
    {
        this.number = number;
        this.name = name;
        this.address = "";        
        this.staff = "";
    }

    public String getName()
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }

    public int getNumber() 
    {
        return number;
    }

    public String getStaff()
    {
        return staff;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public void setIsStaff(String staff) 
    {
        this.staff = staff;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Student target)
        {
            if((getName().equals(target.name)) && (target.number == getNumber()))
            {
                return true;
            }
        }

        return false;
    }


    @Override
    public String toString()
    {
        return "{ "+"name: "+getName()+
                " address: " + getAddress() + 
                " number: " + getNumber() + 
                " staff: "+getStaff()+"}";
    }

    @Override
    public int hashCode()
    {
        // return (name.hashCode() + address.hashCode()) % 5;

        return Objects.hash(name, address, number, staff); // 넣을 데이터량이 작을때 써도 무관
    }

    @Override
    // 기존에 있는애 compare에 새로온녀석 compare를 집어넣는다
    // 2개를 비교한다 
    public int compareTo(Student stu)
    {

        if ((false == staff.isEmpty()) && (true == stu.getStaff().isEmpty()))
        {
            return -1;
        }
        else if ((true == staff.isEmpty()) && (false == stu.getStaff().isEmpty()))
        {
            return 1;
        }
        else if((false == staff.isEmpty()) && (false == stu.getStaff().isEmpty()))
        {
            return 0;
        }
        else
        {
            return this.number - stu.getNumber();
        }



        // 1. this가 앞으로 가는 경우  => 음수를 리턴
        // 2. 파라미터(stu) 가 앞으로 가는 경우  => 양수로 리턴
        // 3. this와 파라미터가 같아서 스왑할필요가 없다 => 0

        // 작은수의 number가 앞으로 갈껀지 큰수의 number가 앞으로 갈껀지
        // 는 정해야 스왑을 할거아닌가? 작은놈이 앞으로가면 오름차순 큰놈이

        // 앞으로 가면 내림차순



        // return this.number - stu.number;  <<이렇게 간략하게 가능

        // if(this.number > stu.number)
        // {
        //     return 1; // 양수
        // }
        // else if (this.number < stu.number)
        // {
        //     return -1; // 음수
        // }
        // else if (this.number == stu.number)
        // {
        //     return 0;
        // }
/////////////////////////////////////////////////////////////////////////////////////////////////
        // // 1. stu : 스태프o && this : 스태프x
        // if((this.getStaff().equals("")) && (false == stu.getStaff().equals("")))
        //     {
        //         return 1;
        //     }
        // // 2. stu : 스태프x && this : 스태프o
        // else if((false == this.getStaff().equals("")) && (stu.getStaff().equals("")))
        //     {
        //         return -1;
        //     }

        // // 3. stu : 스태프o && this : 스태프o
        // else if(false == (this.getStaff().equals("")) && false == (stu.getStaff().equals("")))
        // {
        //     return 0;
        // }

        // // 4. stu : 스태프x && this : 스태프x
        // else // if ((this.getStaff().equals("")) && (stu.getStaff().equals("")))
        // {
        //     return this.number - stu.number;
        // }
        // // else
        // // {
        // //     return this.number - stu.number;
        // // }
///////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
