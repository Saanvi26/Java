import java.util.Scanner;
import java.math.*;
public class largeFactorial {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
      int n=sc.nextInt();
        System.out.println(factorial(n));
   }
   public static BigInteger factorial(long n){
      BigInteger fact=BigInteger.ONE;
      for(int i=1;i<=n;i++){
         fact=fact.multiply(BigInteger.valueOf(i));
      }
      return fact;
   } 
}
