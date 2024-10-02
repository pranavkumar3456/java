import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = scn.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(N + " is a prime number");
        } else {
            System.out.println(N + " is not a prime number");
        }
    }
}
