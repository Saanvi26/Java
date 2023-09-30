import java.math.BigInteger;

public class G {
    public static void main (String args[]){
        //  BigInteger ...
        BigInteger a= new BigInteger ("9223372036854775807");
        BigInteger b= new BigInteger ("2");
        BigInteger c=a.multiply(b);
        System.out.println(c);  
      

    }
}
