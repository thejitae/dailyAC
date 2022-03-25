import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());    //카드의 개수
        int M = Integer.parseInt(st.nextToken());    //가까워야 하는 수
        int[] arr = new int[N]; //카드 배열
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);

    }

    private static int search(int[] arr, int N, int M) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(M == sum){
                        return sum;
                    }

                    if(result < sum && sum < M){
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}
