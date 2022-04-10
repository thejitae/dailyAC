package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8958 {
    //완 전 치 팅 ㅠㅠ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        //int N = Integer.parseInt(br.readLine());
        //int N = Integer.parseInt(st.nextToken());

        String[] arr = new String[Integer.parseInt(br.readLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int O = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') O++;
                else O = 0;
                sum += O;
            }

            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
