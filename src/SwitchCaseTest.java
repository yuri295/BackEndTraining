public class SwitchCaseTest {
    public static void main(String[] args) {
        String day = "Sunday";
        switch(day) {
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("배드민턴 치기");
                break;
            case "Tuesday":    
            case "Wednesday":
                System.out.println("탁구치기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
