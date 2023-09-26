import java.util.*;
// common prefix
public class D {
    public static String commonPrefix(String s1,String s2){
        String s="";
        int l=Math.min(s1.length(),s2.length());
        for (int i=0;i<l;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s=s+s1.charAt(i);
            }
            else {
                break;
            }
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
         String s2=sc.nextLine();
         System.out.println("Common Prefix is : "+ commonPrefix(s1,s2));

    }
}
