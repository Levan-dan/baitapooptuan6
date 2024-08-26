import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFileStream {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "save.bin";
        String data = "hello, I am Dan";
        FileOutputStream  fos = null;
        try  {
           fos = new FileOutputStream(filePath);
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            System.out.println("du lieu da dc ghi thanh cong.");
        } catch (IOException e) {
            System.out.println("xay ra ngoai le roi");
        }finally {
            try{
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("chua the dong file");
            }
        }
    }
}
