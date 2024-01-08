import java.util.Comparator;

public class PersonComparator implements Comparator<Person>,  java.io.Serializable{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge())
            return -1;
        else if (o1.getAge() < o2.getAge())
            return 1;
        else
            return 0;
    }
}
