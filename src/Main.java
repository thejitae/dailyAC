import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //11047
    public static void main(String[] args) throws IOException {
        //입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //동전 종류 개수 N과 목표 합계액 K 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //동전 종류 배열
        int[] coinArr = new int[N];

        //동전 종류 오름차순 입력
        //입력 조건 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000
        for (int i = 0; i < N; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }

        //현재 금액 sum과 필요 동전 개수 cnt
        int sum = 0;
        int cnt = 0;

        while (sum < K) {
            cnt++;
            for (int i = N-1; i > 0; i--) {
                if (coinArr[i] <= K-sum) {
                    sum += coinArr[i];
                    break;
                }
            }
        }

        //필요 동전 개수 cnt 출력
        System.out.println(cnt);
    }
}
