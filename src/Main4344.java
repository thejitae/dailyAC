/*
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();   //테스트 케이스 개수

        ArrayList<Double> studentRatioMoreThanAverageArr = new ArrayList<>(); //평균을 넘는 학생들의 비율 배열

        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();   //학생 수

            double score = 0;   //점수의 합 또는 평균

            for (int j = 0; j < N; j++) {

                score += sc.nextInt();
                if(j == N-1){
                    score = score/N;
                }
            }

            int studentNumberMoreThanAverage = 0;   //평균을 넘는 학생들의 수

            studentRatioMoreThanAverageArr.add(score/N);
        }

        for (int i = 0; i < studentRatioMoreThanAverageArr.size(); i++) {
            System.out.printf("%.3f%%\n", studentRatioMoreThanAverageArr.get(i));

        }
    }
}
*/

import java.util.Scanner;

public class Main4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr;

        int testcase = in.nextInt();

        for(int i = 0 ; i < testcase ; i++) {

            int N = in.nextInt();	//학생 수
            arr = new int[N];

            double sum = 0;	// 성적 누적 합 변수

            // 성적 입력부분
            for(int j = 0 ; j < N ; j++) {
                int val = in.nextInt();	// 성적 입력
                arr[j] = val;
                sum += val;	// 성적 누적 합
            }

            double mean = (sum / N) ;
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/N)*100);


        }
        in.close();
    }

}