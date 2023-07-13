import java.util.*;
public class evenodd
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N = scan.nextInt();
	
		if(N%2==0){
		   System.out.printf("Even");
		}
		else{
		   System.out.printf("Odd");
	}

}
}