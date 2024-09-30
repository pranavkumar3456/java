import java.util.ArrayList;
import java.lang.*;

public class arraylistbas {

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(40);
        numbers.add(70);
        System.out.println("Initial ArrayList:" + numbers);

        int fno = numbers.get(0);
        System.out.println("first number:" +fno);

        numbers.set(1,67);
        System.out.println("After Modifying: " +numbers);

        numbers.remove(4);
        System.out.println("After remove one element: " +numbers);

        numbers.remove(Integer.valueOf(20));
        System.out.println("After removing element 20"+numbers);
    }

}
