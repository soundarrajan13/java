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
      System.out.println ("Enter a number:");
    int val = scan.nextInt ();
    int rem = (val % 100);
    int r = (rem - val % 10) / 10;
      return r;

  }



  public static void main (String[]args)
  {
    int n1 = Main.even ();
    System.out.println (n1);
  }
}
