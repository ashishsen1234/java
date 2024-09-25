public class unchecked_excp2 {
    public static void main(String[] args) 
    {
        try
        {
       throw new ArithmeticException("run TIME ERROR");
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
       System.out.println("prog continue");
    } 
}
