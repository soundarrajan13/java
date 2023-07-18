
import java.util.Scanner; 
class oddeven{
    public static void main(String[] args) {
        //to check given number is which is greater 
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the n1: ");
         int n1=scan.nextInt();
        System.out.println("Enter the n2: ");
        int n2=scan.nextInt();
        if((n1+n2)%2==0){
            System.out.println("The sum  even.");
        }
       
        else{
            System.out.println("The sum is odd. ");
        }
        
        
    }
}