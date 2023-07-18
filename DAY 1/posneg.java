/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; 
class posneg{
    public static void main(String[] args) {
        //to check given number is positive or negative or zero
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=scan.nextInt();
        if(n>0){
            System.out.println("The number is Positive.");
        }
        else if(n==0){
            System.out.println("The number is Zero. ");
        }
        else{
            System.out.println("The number is Negative. ");
        }
        
        
    }
}