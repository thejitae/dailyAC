package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer stSub = new StringTokenizer(br.readLine(), "-");
        while (stSub.hasMoreTokens()) {
            int tmp = 0;
            StringTokenizer stAdd = new StringTokenizer(stSub.nextToken(), "+");
            while (stAdd.hasMoreTokens()) { tmp += Integer.parseInt(stAdd.nextToken()); }
            if (sum == Integer.MAX_VALUE) { sum = tmp; }
            else { sum -= tmp; }
        }
        System.out.println(sum);
    }
}
