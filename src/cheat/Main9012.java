package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9012 {
    //9012
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    //테스트 데이터 개수

        for (int i = 0; i < T; i++) {
            sb.append(vpsFinder(br.readLine())).append('\n');
        }

        System.out.println(sb);

    }

    private static String vpsFinder(String readLine) {

        int count = 0;

        for (char c : readLine.toCharArray()) {
            if (c == '('){
                count++;
            }
            else if(count == 0){
                return "NO";
            }
            else{
                count--;
            }
        }
        if(count == 0){
            return "YES";
        }
        else {
            return "NO";
        }

    }
}
