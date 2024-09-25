import java.io.IOException;

public class checked_excp{
    public static void main(String[] args) throws IOException
    {
       throw new IOException("COMPILE TIME ERROR");
       System.out.println("prog continue");
    }
    
}