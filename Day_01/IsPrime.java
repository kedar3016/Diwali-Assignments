import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean flag = true;

        if (n <= 1) {
            flag = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("True");
        else
            System.out.println("False");
   
            sc.close();
        }

}