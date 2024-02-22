package baitap.bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindWord {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String s = findMaxOfLength("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai3\\databai3.txt");
        System.out.println(s +s.length());
    }

    public static String findMaxOfLength(String path) throws IOException {
        List<String> strings = new ArrayList<>();

        try (InputStream inputStream = new FileInputStream(path)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                strings.add(new String(buffer, 0, bytesRead));
            }

            System.out.println("đọc file thành công" );

        } catch (IOException e) {
            e.printStackTrace();
        }
       String[] arr= strings.toString().split(" ");
        int max = 0;
        String word = "";
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
                word = s;
            }
        }
        return word;
    }
}
