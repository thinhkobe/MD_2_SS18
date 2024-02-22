package baitap.bai4;

import java.io.*;

public class Reverce {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai4\\databai4.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        String text="chuỗi cần đảo ngược";
        oos.writeObject(text);

        reverceText("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai4\\databai4.txt");

    }
    public static void reverceText(String parth) throws IOException {
        FileInputStream fis;
        ObjectInputStream ois;
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fis=new FileInputStream(parth);
            ois=new ObjectInputStream(fis);
            String text=ois.readObject().toString();
            String reverceText= String.valueOf(new StringBuilder(text).reverse());
            fos=new FileOutputStream("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai4\\reverceText.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(reverceText);
            ois.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
