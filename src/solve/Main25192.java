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
            greeting.add(str);
            if (str.equals("ENTER")) {
                greeting.remove("ENTER");
                sum += greeting.size();
                greeting = new HashSet<>();
            } else {
                count = greeting.size();
            }
        }
        sum += count;

        System.out.println(sum);
    }
}
