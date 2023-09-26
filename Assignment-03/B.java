import java.util.Scanner;
// valid password checking
public class B {
    public static int checkValidPassword(String s) {
        int num=0;
        int alpha=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                num++;
            }
            else if ((s.charAt(i)>=65 &&s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122 )){
                alpha++;
            }
            else {
                return 0;
            }
        }
        if(alpha>=8 && num>=2)
        return 1;
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(checkValidPassword(str)==1){
         System.out.println("Valid password");
        }
        else {
          System.out.println("Not Valid password");
        }
    }
}
