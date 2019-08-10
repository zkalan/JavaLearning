import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    public static void main(String[] args) {
        FileInputStream fls = null;
        try{
            fls = new FileInputStream("c:/ab.txt");
        } catch(FileInputStreamExceptin e) {
            e.printStackTrace();
        } finally {
            if(fls != null){
                try{
                    fls.close();
                } catch (FileInputStreamExceptin e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}