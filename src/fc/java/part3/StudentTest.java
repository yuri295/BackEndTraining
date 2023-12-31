package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=10;
        arr[1]=30;
        arr[2]=67;
        arr[4]=98;
        arr[5]=55;
        arr[6]=32;
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        Student vo = new Student("진유리","컴퓨터공학부",22,"yuri@mx.com",20230510,"010-1111-1111");
        System.out.println(vo.toString());


    }
}
