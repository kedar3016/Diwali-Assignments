import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n,sum = 0;
		n =sc.nextInt();
		for(int i = 1;i<=n;i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		System.out.println("The Sum of Odd Number : "+sum);
		

	}

}
