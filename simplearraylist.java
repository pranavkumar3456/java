import java.util.ArrayList;

public class simplearraylist {

    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Hello");

        System.out.println("First element: " + names.get(0));

        names.set(1,"David");
        names.remove("Hello");

        for(String name: names)
        {
            System.out.println(name);
        }

        System.out.println("Size of ArrayList:"+names.size());
    }
}
