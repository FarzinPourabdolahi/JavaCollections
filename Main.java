import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Seattle");
        collection1.add("New York");
        collection1.add("Dallas");

        ArrayList<String> collection2 = new ArrayList<>();
        collection2.add("Atalanta");
        collection2.add("Dallas");
        collection2.add("Chicago");

        ArrayList<String> collection3 = (ArrayList<String>) collection1.clone();
        collection1.set(0, "Madison");
        System.out.println("The collection1 contains : \n" + collection1 +"\n");
        System.out.println("The collection3 contains : \n" + collection3 +"\n");
        //clone() makes a copy of collection1 into collection3. It means that
        //making change in collection1 does not affect collection3

        collection3.addAll(collection2);
        collection2.set(0, "Portland");
        System.out.println("The collection1 contains : \n" + collection2 +"\n");
        System.out.println("The collection3 contains : \n" + collection3 +"\n");
        //addAll() adds a copy of collection2 into collection3. It means that
        //making change in collection2 does not affect collection3

        Iterator<String> iterator = collection3.iterator();
        System.out.println("All cities with iterator() : ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
        //Each collection implement the Iterable interface which has an
        //iterator() which return an Iterator instance for traversing collection

        System.out.println("All cities without iterator");
        for(String elements : collection3)
            System.out.println(elements.toUpperCase());
        //Traverse collection without iterator

        System.out.println("All cities with forEach : ");
        collection3.forEach(e -> System.out.println(e.toUpperCase()));
        //Traverse collection with forEach

        Person p1 = new Person("Farzin", 40);
        Person p2 = new Person("Elena", 10);
        PersonComparator pc = new PersonComparator();
        int result = pc.compare(p1, p2);
        if(result==-1)
            System.out.println(p1.getName()+" is older than "+ p2.getName());
        else if (result==1)
            System.out.println(p2.getName()+" is older than "+ p1.getName());
        else
            System.out.println(p1.getName()+" and "+ p2.getName()+" are in the same age");
        //Compare a class which does not implement Comparable interface
        //with a comparator class which implements Comparator interface

        List<String> cities = java.util.Arrays.asList("Dallas", "Chicago", "New York", "Atalanta");
        cities.sort((s1, s2)->s1.compareToIgnoreCase(s2));
        cities.forEach((city)-> System.out.println(city));
        //Sorting a list by natural order and lambda expression
        System.out.println("-------------------------------------");
        cities.sort(Comparator.comparing(String::length));
        cities.forEach((city)-> System.out.println(city));
        //Sort cities with method reference and comparing method of Comparator
        //interface by cities length

        Collections.sort(cities);
        System.out.println(cities);

        Collections.sort(cities, Collections.reverseOrder());
        System.out.println(cities);
        //Sort cities with Collections' static methods with natural order and
        //with a comparator

        List<Person> list1 = Collections.nCopies(3, new Person("Ali", 10));
        System.out.println(list1);
        //nCopies() method which is a static one in Collections class



    }
}
