import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //1929
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        //3 4 5 6 7 8 9 10 11 12 13 14 15 16
        for (int i = M; i <= N; i++) {

            //1 이하 버리기
            if (i < 2) {
                continue;
            }

            //2 넣기
            if (i == 2) {
                sb.append(i).append('\n');
            }

            //2가 아닌 짝수 버리기
            if (i != 2 && i % 2 == 0) {
                continue;
            }

            //2부터 나누기 시작해서 나머지가 0이 되는 게 있으면 버리기
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue;
                }
            }

            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static void isPrime(int number) {

    }
}
