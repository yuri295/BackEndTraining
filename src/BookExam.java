public class BookExam {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "연애 성공 비법";
        b.price = 100000;
        b.company = "요정의 눈물";
        b.author = "진유리";
        b.page = 1004;
        b.isbn = "ISBN-111021105";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn+"\t");
    }
}
