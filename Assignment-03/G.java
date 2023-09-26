import java.util.*;
public class G {
    public static void main (String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean flag=false;
        int count=1;
        for (int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                count++;
            }
            else {
                if(count==4){
                    flag=true;
                    break;
                }
                else{
                    count=1;
                }
            }
        }
        if(flag==true){
            System.out.println("consecutive fours");
        }
        else{
            System.out.println(" no consecutive fours");
        }
    }
}
