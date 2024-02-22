package baitap.bai1;

import java.io.*;

public class Count {
    public static void main(String[] args) throws IOException {
        //tạo file
        File data=new File("dataBai1.txt");
        if(!data.exists()){
            try{
                data.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //đọc file
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\HP\\MD2-JAVA\\SS18-file\\src\\filebai1.txt");
           InputStreamReader isr=new InputStreamReader(fis);
           BufferedReader br=new BufferedReader(isr);
          String[] text= br.readLine().trim().split(" ");
            System.out.println(text.length);

        }catch (IOException e){

        }
    }
    // Hàm đọc nội dung từ file và trả về dưới dạng chuỗi
    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
