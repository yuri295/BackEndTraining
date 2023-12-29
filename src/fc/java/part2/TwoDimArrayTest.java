package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        int [][] a = new int[2][4];
        System.out.println(a.length); //행의 길이
        System.out.println(a[0].length); //열의 길이
        int[][] b = {
                {1,2,3,4},
                {5,6,7,8},

        };
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println(); //줄바꿈
        }
        int[][] c = new int[5][];
        c[0] = new int[1];
        c[1] = new int[2];
        c[2] = new int[3];
        c[3] = new int[4];
        c[4] = new int[5];
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                c[i][j] = '*';
                System.out.print((char)c[i][j] + "\t");
            }
            System.out.println(); //줄바꿈
        }
    }
}
