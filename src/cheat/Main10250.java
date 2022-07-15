package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {
    public static void main(String[] args) throws IOException {
        //입력용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        //출력용
        StringBuilder sb = new StringBuilder();

        //테스트 케이스 별 상황
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            sb.append(room(H, W, N)).append('\n');
        }

        //출력
        System.out.println(sb);
    }

    private static int room(int h, int w, int n) {
        //층, 호
        int y, x;

        if (n%h == 0) {
            y = h * 100;
            x = n / h;
        }
        else {
            y = (n%h) * 100;
            x = (n/h) + 1;
        }
        return y + x;
    }
}
