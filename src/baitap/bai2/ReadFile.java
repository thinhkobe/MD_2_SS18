package baitap.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
    FileOutputStream fos= new FileOutputStream("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai2\\source.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject("chuc mung nam moi");
    copyFile("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai2\\source.txt","C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai2\\target.txt");
    }
    public static void copyFile(String source,String taget) throws FileNotFoundException {
        // Kiểm tra xem tệp nguồn có tồn tại không
        File sourceFile=new File(source);
        if (!sourceFile.exists()){
            System.out.println("file không tồn tại");return;
        }
        // Kiểm tra xem tệp đích đã tồn tại chưa
        File targetFile = new File(taget);
        if (!targetFile.exists()) {
            System.out.println("chưa có file lưu tập tin");
            return;
        }
        // Thực hiện sao chép tệp
        FileInputStream fis = null;
        ObjectInputStream ois=null;

        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fis=new FileInputStream(source);
            ois=new ObjectInputStream(fis);

            fos=new FileOutputStream(taget);
            oos=new ObjectOutputStream(fos);

            oos.writeObject( ois.readObject());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
