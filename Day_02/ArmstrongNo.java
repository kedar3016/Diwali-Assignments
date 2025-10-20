import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number: ");
		        int n = sc.nextInt();
		        int original = n;
		        int sum = 0,digit = 0;;
		        while (n != 0) {
		            digit++;
		           
		            n = n/10;
		        }
		        n=original;

		        while (n != 0) {
		            int temp = n % 10;
		            sum += Math.pow(temp, digit);
		            n =n/10;
		        }
		        
		        if (sum == original)
		            System.out.println("True ");
		        else
		            System.out.println("False");
		    
		


	}

}
