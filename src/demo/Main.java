//package demo;
//
//import java.io.ObjectOutputStream;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        // thao tác đọc ghi file nhị phân
//        File source = new File("person.txt");
//        if (!source.exists()) {
//            try {
//                source.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        // ghi file
////        Person person1 = new Person(12,"Nguyễn Văn C");
////        List<Person> list = new ArrayList<>();
////        list.add(person1);
////
////        FileOutputStream fos = new FileOutputStream(source);
////        ObjectOutputStream oos = new ObjectOutputStream(fos);
////        oos.writeObject(list);
////         đọc file
//        try {
//            FileInputStream fis = new FileInputStream(source);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            List<Person> persons = (List<Person>) ois.readObject();
//            persons.add(new Person(24, "Nguyễn Thị D"));
//            FileOutputStream fos = new FileOutputStream(source);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(persons);
//        } catch (EOFException e) {
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public static <T> void  writeToFile(String path,List<T> list){
//        File file = new File(path);
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try{
//            fos = new FileOutputStream(file);
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            oos.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//    public static <T> List<T> readFromFile(String path){
//        File file = new File(path);
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        List<T> list = new ArrayList<>();
//        try{
//            fis = new FileInputStream(file);
//            ois = new ObjectInputStream(fis);
//            list = (List<T>) ois.readObject();
//            ois.close();
//        }catch (EOFException | FileNotFoundException e){
//
//        } catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//}
