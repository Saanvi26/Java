import java.util.Scanner;
public class Four {
    public static void main (String[] args){
        int n,r;
        // LEARNING SCANNER CLASS IN JAVA
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        r = n%2;
        if(r==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
      }
}
