public class ObjectArrayTest {
    public static void main(String[] args) {
        // 책 3권을 저장할 배열을 생성하고 책3권의 데이터를 저장하고 출력하시오.
        Book[] b = new Book[3]; //객체 배열
        b[0] = new Book();
        b[0].title = "시간 여행자";
        b[0].price = 100000;
        b[0].company = "요정의 눈물";
        b[0].author = "유리";
        b[0].page = 1004;
        b[0].isbn = "ISBN-111021105";

        b[1] = new Book();
        b[1].title = "은하수가 쏟아지던 밤";
        b[1].price = 100000;
        b[1].company = "요정의 눈물";
        b[1].author = "유리";
        b[1].page = 1004;
        b[1].isbn = "ISBN-111030207";

        b[2] = new Book();
        b[2].title = "세상의 마지막 기차역";
        b[2].price = 100000;
        b[2].company = "요정의 눈물";
        b[2].author = "유리";
        b[2].page = 1004;
        b[2].isbn = "ISBN-111931103";
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].page+"\t"+b[i].isbn+"\t");
        }






    }
}
