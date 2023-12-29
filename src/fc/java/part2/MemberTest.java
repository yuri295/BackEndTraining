package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.phoneNumber = "010-1111-1111";
        m.email = "fc@naver.com";
        m.address = "서울";
        m.weight = 57.6;
        System.out.println(m.name+"\t"+m.age+"\t"+m.phoneNumber+"\t"+ m.email+"\t"+m.address+"\t"+m.weight+"kg");




    }
}
