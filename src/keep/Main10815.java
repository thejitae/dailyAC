package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //상근이 카드
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] mine = new int[N];
        for (int i = 0; i < N; i++) {
            mine[i] = Integer.parseInt(st.nextToken());
        }

        //시간초과 때문에 추가
        Arrays.sort(mine);
        int mineLengthHalf = mine.length/2;

        //비교할 카드
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] yours = new int[M];
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            yours[i] = Integer.parseInt(st.nextToken());//10

            //상근이 카드 배열의 가운데 숫자가 비교 대상 카드보다 크면 줄여가면서
            if (mine[mineLengthHalf] >= yours[i]) {
                for (int j = mineLengthHalf; j >= 0; j--) {
                    if (mine[j] == yours[i]) {
                        result[i] = 1;
                        break;
                    }
                }
            //작으면 가운데부터 늘려가면서
            } else {
                for (int j = mineLengthHalf+1; j < mine.length; j++) {
                    if (mine[j] == yours[i]) {
                        result[i] = 1;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < M; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}
