public class IfElseIfTest {
    public static void main(String[] args) {
        int jumsu = 79;
        if(jumsu>=0 && jumsu<=100) {
            if (jumsu >= 90) {
                System.out.println("A반");
            } else if (jumsu >= 85) {
                System.out.println("B반");
            } else if (jumsu >= 80) {
                System.out.println("C반");
            } else {
                System.out.println("불합격");
            }
        }
        else{
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
