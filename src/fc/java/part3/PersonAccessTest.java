package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "진유리";
        p.age = 1000;
        p.phone = "010-XXXX-XXXX";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
