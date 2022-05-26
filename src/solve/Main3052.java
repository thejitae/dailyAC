package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            hs.add(arr[i]%42);
        }

        System.out.println(hs.size());
    }
}
