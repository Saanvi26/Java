import java.util.*;
import java.lang.*;
class StringBuilderExamples {
    public static void main(String[] args) {
      // append
   // append
   StringBuilder sb=new StringBuilder("Hello ");
   sb.append("java");
   System.out.println(sb);
   // insert
   StringBuilder s=new StringBuilder("Hello ");  
   s.insert(1,"Java");
   System.out.println(s);
   // replace
   StringBuilder sb2=new StringBuilder("Hello ");
   sb2.replace(1,3,"Java");  
   System.out.println(sb2);
   // delete
   StringBuilder sb3=new StringBuilder("GoodMorning");
   sb3.delete(1,4);  
   System.out.println(sb3);
   // reverse 
    StringBuilder sb4=new StringBuilder("ORACLE");
    sb4.reverse();
    System.out.println(sb4);
   // capacity
   StringBuilder sb5=new StringBuilder();
   System.out.println(sb5.capacity());
   sb5.append("HELLO");
    System.out.println(sb5.capacity());
    sb5.append("Java is my favourite coding language!");
      System.out.println(sb5.capacity());
     //split 
     String str[]="Java#HTML#Php".split("#");
     for (int i=0;i<str.length;i++){
       System.out.print(str[i]+" ");
     }
     System.out.println("\n");
    //  join
    String joinString=String.join("#","welcome","to","java","programming");
    System.out.println(joinString);

    }
}