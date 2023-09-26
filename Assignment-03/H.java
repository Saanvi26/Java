import java.util.Scanner;
public class H {
    public static int[] eliminateDuplicates(int[] list) {
        int [] m=new int[list.length];
        int k=0;
        m[k++]=list[0];
        for (int i=1;i<list.length;i++){
            boolean flag=false;
           for (int ele : m){
            if(ele==list[i]){
                flag=true;
                break;
            }
           }
           if(!flag){
            m[k++]=list[i];
           }
        }
        return m;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
         System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int [] result=eliminateDuplicates(a);
        for (int t :result ){
            if(t!=0)
            System.out.print(t+" ");
        }
    }
}
