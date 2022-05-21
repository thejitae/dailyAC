package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1065 {
    public static void main(String[] args) throws IOException {
        //입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N 입력
        int N = Integer.parseInt(br.readLine());

        //한수 개수 출력
        System.out.println(solve(N));
    }

    private static int solve(int N) {
        //한수의 개수
        int count = 0;

        //입력된 수가 99 이하일 때 입력값 그대로 return
        if (N <= 99) {
            return N;
        }

        //입력된 수가 100 이상일 때
        else {
            //1~99 최소 99개의 한수 대입
            count = 99;

            for (int i = 100; i <= N; i++) {
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;

                if ((hun-ten) == (ten-one)) {
                    count++;
                }
            }

            return count;
        }
    }
}
