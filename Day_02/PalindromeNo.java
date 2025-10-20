import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int rev = 0,num = n;
		
		while(num != 0) {
			 int temp = num%10;
			 rev = temp + rev*10;
			 num = num/10;
		}
		if(n == rev) {
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
