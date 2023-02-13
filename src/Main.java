import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws WrongAgeException {
//        int[] arr = new int[5];
//        arr[6] = 5;

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(55);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.set(3, 50);
//        arrayList.add(0, 100);
//        System.out.println(arrayList.set(1, 45));
//        System.out.println(arrayList.set(1,74));
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(2));
//        arrayList.remove(0);
//        System.out.println(arrayList.get(0));

//        System.out.println(arrayList);  // birinchi jolu

//        for (Integer integer: arrayList) {
//            System.out.println(integer);
//        } // ekinchi jolu

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        } // uchunchu jolu

//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        } // tortunchu jolu

//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Hello");

        Student student = new Student("Jack", 24);
        Student student2 = new Student("Niko", 34);
        Student student3 = new Student("Misha", 25);
        Student student4 = new Student("Nike", -24);
        Student student5 = new Student("Karl", 18);

        try{
            ArrayList<Student> arrayList = new ArrayList<>();
            arrayList.add(student);
            arrayList.add(student2);
            arrayList.add(student3);
            arrayList.add(student4);
            arrayList.add(student5);
            arrayList.add(null);

            System.out.println(arrayList);
        }catch (IndexOutOfBoundsException o){
            System.out.println(o.getMessage());
        }
        finally {
            System.out.println("buttu");
        }


    }
}