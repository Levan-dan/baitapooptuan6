package ghidoituong;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductProcess {
    public static boolean writeObjectData(Product objProduct, String fileName){
        ObjectOutputStream objectOutputStream = null;
        try {
            // Tạo đối tượng ObjectOutputStream để mở file và ghi đối tượng
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Ghi đối tượng vào file
            objectOutputStream.writeObject(objProduct);

            // Việc ghi đối tượng thành công
            return true;
        } catch (IOException e) {
            // Xử lý ngoại lệ và báo lỗi
            e.printStackTrace();
            return false;
        } finally {
            // Đảm bảo rằng ObjectOutputStream được đóng
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

            // Ví dụ sử dụng phương thức writeObjectData
            Product product = new Product(1,"Laptop", 1200.00);
            String fileName = "product.dat";
            boolean result = writeObjectData(product, fileName);
            System.out.println("Ghi đối tượng thành công: " + result);

    }
    }



