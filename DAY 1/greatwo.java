
import java.util.Scanner; 
class greatwo{
    public static void main(String[] args) {
        //to check given number is which is greater 
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the n1: ");
         int n1=scan.nextInt();
        System.out.println("Enter the n2: ");
        int n2=scan.nextInt();
        if(n1>n2){
            System.out.println("The n1  is greater.");
        }
       
        else{
            System.out.println("The n2 is greater. ");
        }
        
        
    }
}