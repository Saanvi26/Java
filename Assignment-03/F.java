import java.util.*;
// Checking substring
public class F {
    public static boolean checkSubstr(String s1,String s2){
        if(s2.length()>s1.length()){
            return false;
        }
        int k=0;
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(k)){
                k++;
            }
            if(k==s2.length()){
                break;
            }
        }
        if(k==s2.length())   
             return true;
             return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
         String s2=sc.nextLine();
         if(checkSubstr(s1,s2)==true)
         System.out.println("Substring");
         else
          System.out.println("Not a Substring");
    }
}
