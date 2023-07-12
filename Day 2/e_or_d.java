import java.util.Scanner;
class e_or_d{
    public static void main(String[] args) {
        //to print given number is even or odd
        Scanner scan=new Scanner(System.in);
        System.out.println("--------To Check Even or Odd-------");
        
        System.out.println("Enter a Number:");
        int num=scan.nextInt();
        if(num%2==0)
            System.out.println(num+" Is Even Number ");
        else 
             System.out.println(num+" Is Odd Number ");
    }
}