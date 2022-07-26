package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a-1] = true;
        }
        for (int i = 0; i < 30; i++) {
            if (arr[i] == false) System.out.println(i+1);
        }
    }
}
