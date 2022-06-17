package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //채팅방 기록 수
        int N = Integer.parseInt(br.readLine());

        //
        HashSet<String> greeting = new HashSet<>();

        //인사 횟수
        int count = 0;
        int sum = 0;

        //
        String str = "";

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (str.equals("ENTER")) {
                greeting = new HashSet<>();
                continue;
            }
            if (!greeting.contains(str)) {
                greeting.add(str);
                sum++;
            }
        }

        System.out.println(sum);
    }
}
