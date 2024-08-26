import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile1 {
    public static void main(String[] args) throws IOException {
        String text = "Lúc ở nhà mẹ cũng là cô giáo.";
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("person.dat");
            byte[] dataByte = text.getBytes();
            fileOutputStream.write(dataByte);
            System.out.println("da ghi thanh cong");
        }catch (IOException e){
            System.out.println("loi roi");
        }finally {
            try{
                if(fileOutputStream != null){
                    fileOutputStream.close();
                    System.out.println("da dong file");
            }

            }catch (IOException e){
                System.out.println("Khong the dong file");
            }
        }

    }
}
