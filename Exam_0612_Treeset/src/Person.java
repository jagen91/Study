public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }




    Person()
    {
        age = 0;
        name = "";

    }

    Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person p)
    {
        return this.age - p.age;   //   오름차순
        // return p.age - this.age;     내림차순
    }

    @Override
    public String toString()
    {
        return name;
    }


    @Override
    public int hashCode()
    {
        return Object.hashCode(age, name);
    }


    @Override
    public boolean equals(Object obj)
    {
        Person p = (Person) obj;

        if ((this.getAge() == p.getAge()) && (this.getName() == p.getName()));
        {
            return true;
        }
    
    }
}