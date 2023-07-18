import java.util.Scanner; 
class evenodd{
    public static void main(String[] args) {
        //to check given number is positive or negative or zero
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.println(n+ "The number is even.");
        }
        
        else{
            System.out.println(n+ "The number is odd. ");
        }
        
        
    }
}