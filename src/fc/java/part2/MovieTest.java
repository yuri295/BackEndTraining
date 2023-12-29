package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.mtitle = "아바타";
        m.releaseDate = "2022.12.14";
        m.mainCharacter = "제이크 설리";
        m.genre = "액션";
        m.runningTime = 192;
        m.mgrade = 12;
        System.out.println(m.mtitle+"\t"+m.releaseDate+"\t"+m.mainCharacter+"\t"+ m.genre+"\t"+m.runningTime+"\t"+m.mgrade+"세");

    }
}
