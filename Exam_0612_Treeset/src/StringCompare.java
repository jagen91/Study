import java.util.Comparator;

public class StringCompare implements Comparator<Person> {

    @Override
    public int compare(Person p1, String p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
    
}
