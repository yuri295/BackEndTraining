package fc.java.model;

public class CarDAO {
    public void carInsert(CarDTO car){
        System.out.println("car정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(){
        //DB 연결, select SQL
        System.out.println("car정보가 출력이 되었습니다.");
    }
}
