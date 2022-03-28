package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1934 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    //테스트 케이스 개수

        int[][] arr = new int[T][2];    //테스트 케이스 배열

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            sb.append(arr[i][0]*arr[i][1]/getGCD(arr[i][0], arr[i][1])).append("\n");
        }

        System.out.println(sb);
    }

    private static int getGCD(int n, int m) {
        while(m != 0){
            int gcd = n % m;
            n = m;
            m = gcd;
        }
        return n;
    }
}
