package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11399 {
    public static void main(String[] args) throws IOException {
        //입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //사람 수 N 입력
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //인출 시간 배열 생성과 입력
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //각 사람이 돈을 인출하는데 필요한 시간의 합
        int sum = 0;

        //배열 정렬
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sum += arr[i]*(N-i);
        }

        //결과 출력
        System.out.println(sum);
    }
}
