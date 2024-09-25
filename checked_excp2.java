import java.io.IOException;

public class checked_excp2 {
       public static void main(String[] args) throws IOException
    {
       try {
        throw new IOException("COMPILE TIME ERROR");
       } catch (Exception e) {
        System.out.println("compile time error");
       }
        
       System.out.println("prog continue");
    }
    
}
