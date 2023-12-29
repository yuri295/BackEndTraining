package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메서드가 있다. => 기본생성자(default Constructor)

    public PersonVO(){
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
        this.name="진유리";
        this.age=22;
        this.phone="010-1111-1111";
    }

    public PersonVO(String name,int age,String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    // setter,getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
