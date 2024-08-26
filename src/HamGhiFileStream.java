import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HamGhiFileStream {
    public static void ghiFileStream(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap du lieu");
        String data;
        try (FileOutputStream fos = new FileOutputStream(file, true)) {

            while (true) {
                data = scanner.nextLine();
                if (data.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    try{
                        byte[] bytes = data.getBytes();
                        fos.write(bytes);
                        fos.write(System.lineSeparator().getBytes());
                    }catch (IOException e){
                        System.out.println("loi nha");
                    }

                }
            }
            System.out.println("da ghi thanh cong");
        } catch (IOException e) {
            System.out.println("co ngoai le roi");
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        String saveData = "saveData.bin";
        ghiFileStream(saveData);
    }
}
