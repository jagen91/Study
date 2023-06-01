public class Student {
    public String name;
    public int age;


    public Student()
    {        
    }
 
    public Student(String name, int age)
    {        
        this.name = name;
        
        try{
            this.age = age;
            if ((age <= 0) || (age >150))
            {
                throw new ReadAgeException();
            }

        }
        catch(ReadAgeException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    
}
