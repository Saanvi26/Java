public class Three {
    public static void main (String[] args){
        final int SIZE=3;
        SIZE=SIZE+1;
        System.out.println("The size is: " + SIZE);
        // gives error as we cannot change the value of a final variable
    }
}
