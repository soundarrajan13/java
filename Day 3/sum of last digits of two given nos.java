/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.io.*;
class Main
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter 1st number:");
    int val1 = scan.nextInt ();
      System.out.println ("Enter 2nd number:");
    int val2 = scan.nextInt ();
    int r1 = (val1 % 10);
    int r2 = (val2 % 10);
      return (r1 + r2);

  }



  public static void main (String[]args)
  {
    int n = Main.even ();
    System.out.println (n);
  }
}
