package baitap.bai5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
//    public static void main(String[] args) {
//        try {
//            FileReader fileReader=new FileReader("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai5\\fileCSV.csv");
//            BufferedReader br=new BufferedReader(fileReader);
//            String line;
//            while ((line=br.readLine())!=null){
//                System.out.println(line);
//            };
//            br.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
public static void main(String[] args) {
    String csvFilePath = "C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\baitap\\bai5\\fileCSV.csv";

    try {
        List<String[]> records = readCSV(csvFilePath);

        // In ra các dòng trong file CSV
        for (String[] record : records) {
            for (String field : record) {
                System.out.print(field + " | ");
            }
            System.out.println();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private static List<String[]> readCSV(String filePath) throws IOException {
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Phân tách các trường bằng dấu phẩy
                String[] fields = line.split(",");
                records.add(fields);
            }
        }

        return records;
    }


}
