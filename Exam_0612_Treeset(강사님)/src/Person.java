import java.util.Objects;

public class Person implements Comparable<Person>{
    private int age;
    private String name;


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person()
    {
        age = 0;
        name = "";
    }

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;

    }

    @Override
    public int compareTo(Person p)
    {
        return this.age - p.age;

    }


    @Override
    public String toString() {
        return "{" +
            " age='" + age + "'" +
            ", name='" + name + "'" +
            "}";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj)
    {
        Person p = (Person)obj;

        if ((this.getAge() == p.getAge()) && (this.getName() == p.getName()))
        {
            return true;
        }

        return false;
        
    }

    
}

