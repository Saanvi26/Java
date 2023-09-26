import java.util.Arrays;
import java.util.Scanner;
public class I {
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length!=list2.length){
            return false;
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int i=0;i<list1.length;i++){
            if(list1[i]==list2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n1 = sc.nextInt();
        int a[] = new int[n1];
         System.out.print("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        int n2;
        System.out.print("Enter the number of elements: ");
        n2 = sc.nextInt();
        int b[] = new int[n2];
         System.out.print("Enter the elements: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        if(equals(a,b)==true){
 System.out.print("Equal");
        }
        else{
 System.out.print("Not Equal");
        }

    }
}
