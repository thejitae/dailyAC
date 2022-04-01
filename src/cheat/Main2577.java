package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String number = String.valueOf(a*b*c);
        int[] arr = new int[10];

        for (int i = 0; i < number.length(); i++) {
            arr[(number.charAt(i)-48)]++;
        }

        for (int n :
                arr) {
            System.out.println(n);
        }
    }
}
