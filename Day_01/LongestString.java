import java.util.*;

class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];
        System.out.println("Enter the strings:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int max = arr[0].length();
        for(int i = 1; i < n; i++) {
            if(arr[i].length() > max) {
                max = arr[i].length();
            }
        }

        System.out.println("Length of longest string is: " + max);
    }
}
