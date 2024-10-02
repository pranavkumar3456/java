import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class sortingarraylist {

    public static void main(String[] args)
    {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("Australia");

        System.out.println("Before Sorting: "+countries);

        Collections.sort(countries);
        System.out.println("After sorting (Ascending): "+countries);

        Collections.sort(countries, Collections.reverseOrder());
        System.out.println("After sorting (Descending):" + countries);
    }
}
