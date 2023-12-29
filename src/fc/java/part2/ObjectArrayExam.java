package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3편을 저장할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하시오.
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].mtitle = "노트북";
        m[0].mainCharacter = "노아 캘훈";
        m[0].runningTime = 123;
        m[0].genre = "로맨스";
        m[0].releaseDate = "2004.06.25";
        m[0].mgrade = 15;

        m[1] = new Movie();
        m[1].mtitle = "어바웃타임";
        m[1].mainCharacter = "팀 레이크";
        m[1].runningTime = 123;
        m[1].genre = "로맨스";
        m[1].releaseDate = "2013.09.04";
        m[1].mgrade = 15;

        m[2] = new Movie();
        m[2].mtitle = "시간을 달리는 소녀";
        m[2].mainCharacter = "콘노 마코토";
        m[2].runningTime = 97;
        m[2].genre = "판타지";
        m[2].releaseDate = "2006.07.15";
        m[2].mgrade = 0;

        for (int i =0; i<m.length; i++){
            System.out.println(m[i].mtitle+"\t"+m[i].mainCharacter+"\t"+m[i].runningTime+"\t"+m[i].releaseDate+"\t"+m[i].genre+"\t"+m[i].mgrade+"\t");
        }



    }
}
