package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main25186 {
    //25186
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isHappy = true;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (arr[i] == arr[N-1]) {
                    isHappy = false;
                }
                continue;
            }
            if (arr[i] == arr[i-1]) {
                isHappy = false;
            }
        }

        if (isHappy) {
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");

        }
    }
}
