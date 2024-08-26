package thuchanh2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ghi {
    public static boolean writeData( String fileName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap du lieu vao file.");
        String data;
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            while (true) {
                data = scanner.nextLine();
                if (data.equalsIgnoreCase("exit")) {
                    return true;
                } else {
                    try {
                        byte[] bytes = data.getBytes();
                        fileOutputStream.write(bytes);
                        fileOutputStream.write(System.lineSeparator().getBytes());

                    } catch (IOException e) {
                        System.out.println("gap loi roi");
                        return false;
                    }
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


     static void readData(String fileName) throws FileNotFoundException {

         FileInputStream fileInputStream = null;
         try{
             fileInputStream = new FileInputStream(fileName);
             int i;
             while ((i = fileInputStream.read()) != -1){
                 System.out.println((char) i);
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }

    public static void main(String[] args) throws FileNotFoundException {

        readData("saveData.bin");
    }
}
