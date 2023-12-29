package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name="진유리";
        // dto.age=1000; 접근 불가
        dto.phone="010-XXXX-XXXX";
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
