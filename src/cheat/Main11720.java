package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //실상 안 쓰일 입력

        //출력할 값 선언 초기화
        int sum = 0;

        for (byte value :
                br.readLine().getBytes()) {
            sum += (value - '0');
        }

        //출력
        System.out.println(sum);
    }
}
