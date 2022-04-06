package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int idx = 0;

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int n : arr) {
            count++;
            if(n > max){
                max = n;
                idx = count;
            }
        }

        System.out.println(max);
        System.out.println(idx);

    }
}
