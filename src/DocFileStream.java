import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFileStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("save.bin");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    System.out.println("file da dc dong");
                }
            } catch (IOException e) {
                System.out.println("chua the dong file");
            }
        }


    }
}
