public abstract class StudentFactory {

    public static Student makeStudent(String name, int age)
    {
        if ((age <= 0) || (age >150))
        {
            return null;
        }

        return new Student(name, age);
    }
    
}
