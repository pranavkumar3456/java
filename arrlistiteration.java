import java.util.ArrayList;
import java.util.Iterator;

public class arrlistiteration {

    public static void main(String[] args)
    {
        ArrayList<String> datacolor = new ArrayList<>();

        datacolor.add("Red");
        datacolor.add("blue");
        datacolor.add("yellow");
        datacolor.add("pink");

        // 1. Using a standard for-loop
        System.out.println("Using for-loop:");
        for (int i = 0; i < datacolor.size(); i++) {
            System.out.println(datacolor.get(i));
        }

        System.out.println("\n using enhance for loop");
        for(String data : datacolor)
        {
            System.out.println(data);
        }

        System.out.println("\n using Iterator:");
        Iterator<String> iterator = datacolor.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }


}
