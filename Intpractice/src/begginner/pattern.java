package begginner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class pattern {



	 static void staircase(int n) {

         for(int i=0;i<n;i++)//rows
         {
          for (int j=(n-(i+2));j>=0;j--)//spaces
          {

                  System.out.print(" ");
          }
          for (int j=0;j<=i;j++ )//printing
          {
                System.out.print("#");
          }
System.out.println();
         }


 }

 private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
     int n = scanner.nextInt();
     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

     staircase(n);

     scanner.close();
 }
}
