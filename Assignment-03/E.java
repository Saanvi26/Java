import java.util.Scanner;
public class E {
    public static boolean socialSecurity(String str){
        if(str.length()!=11){
            return false;
        }
        if(str.charAt(3)!='-'|| str.charAt(6)!='-'){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(i==3||i==6){
                continue;
            }
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main (String s){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        if(socialSecurity(str)==true){
            System.out.println("Valid Social Security");
        }
        else {
             System.out.println("Invalid Social Security");
        }
    }
}
