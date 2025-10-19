import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int f1 = 0, f2 = 1, temp;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
    }
}

