import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();   //테스트 케이스 개수

        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();   //학생 수

            double score = 0;   //점수의 합

            double[] scoreArr = new double[N];

            for (int j = 0; j < N; j++) {

                score += sc.nextInt();
            }

            scoreArr[i] = score/N;

        }

    }
}
