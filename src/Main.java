import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //11659
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine()," ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            for (int j = first-1; j <= last-1; j++) {
                sum += arr[j];
            }
            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}
