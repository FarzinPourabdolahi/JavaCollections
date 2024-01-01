import java.util.ArrayList;

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

    }
}