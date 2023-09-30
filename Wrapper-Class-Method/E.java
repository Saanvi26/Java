import java.util.Scanner;
public class E {
    public static void main (String args[]){
     int value=Integer.parseInt("123");
        System.out.println(value);
        double d=Double.parseDouble("12.3");
        System.out.println(d);
        float f=Float.parseFloat("12.3");
        System.out.println(f);
        int i=Integer.parseInt("11",2);
        System.out.println(i);
        int j=Integer.parseInt("1A",16);
        System.out.println(j);
        String str=String.format("%x",26);
        System.out.println(str);
    }
}
