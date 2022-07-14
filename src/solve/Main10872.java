package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        while (N != 0) {
            sum *= N;
            N--;
        }
        System.out.println(sum);
    }
}
