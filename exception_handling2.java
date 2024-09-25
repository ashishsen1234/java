public class exception_handling2 {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b); // throw Exception
            System.out.print("ashish"); // not execute due to  exception occur
        }
        
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Divided by zero operation cannot possible");
        }
        
    
        finally {
            System.out.println("The 'try catch' is finished.");
          }
       
        System.out.print("hello");
      
}
}
