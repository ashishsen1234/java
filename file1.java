import java.io.File;
import java.io.IOException;

public class file1  {
    public static void main(String[] args)  throws IOException{
        File f1 = new File("F:/java programs/name1.txt");
       // System.out.println("is file exist"+f1.exists());
        f1.createNewFile();
        System.out.println("is file exist"+f1.exists());
        System.out.println("is file writable"+f1.canWrite());
        System.out.println("file size"+f1.length());
        System.out.println("file name"+f1.getName());
        //f1.delete();
        System.out.println("is file exist"+f1.exists());


    }
}
