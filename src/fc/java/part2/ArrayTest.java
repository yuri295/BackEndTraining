package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        // 실수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하고 출력하시오.
        float[] f = new float[5];
        for(int i = 0; i < f.length ; i++){
            f[i] = 10;
            System.out.println(f[i]);
        }

        // 정수 5개를 아래처럼 배열에 초기화하고 index 0번째와 index 3번쨰 값을 더하여 출력하시오.
        int [] a = {10,20,30,40,50};
        System.out.println(a[0] + a[3]);
        System.out.println(a.length);

    }

}
