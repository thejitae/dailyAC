package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;  //대상이 되는 수
        int cnt = 1;    //무조건 첫 번째부터 시작하니까

        while (cnt != N){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);

    }
}