package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "진유리";
        p.age = 22;
        p.phone = "010-XXXX-XXXX";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name = "진예지";
        p1.age = 17;
        p1.phone = "010-0000-0000";
        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();

    }
}
