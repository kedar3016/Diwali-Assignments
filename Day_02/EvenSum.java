
import java.util.*;

class EvenSum{
    public static void main(String args[]){

        Scanner sc = new  Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1;i<=n;i++) {
        	if(i%2 == 0) {
        		sum += i;
        	}
        }
        System.out.println("The Sum of Even Number is : "+sum);
    }
}
