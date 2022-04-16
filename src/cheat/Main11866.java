package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Queue<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            que.add(i);
        }

        sb.append('<');

        while (que.size() > 1) {
            for (int i = 0; i < K-1; i++) {
                que.offer(que.poll());
            }

            sb.append(que.poll()+1).append(", ");
        }

        sb.append(que.poll()+1).append('>');

        System.out.println(sb);

    }
}
