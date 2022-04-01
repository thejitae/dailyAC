package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        System.out.println(calculate(X));
    }

    private static int calculate(int X) {
        int count = 0;  //연산 횟수
        while(X!=1){
            //0. X가 6으로 나누어 떨어지면 6으로 나눈다. count+2;
            if(X%6==0){X = X/6; count++; count++; continue;}
            //1-1. X가 3으로(만) 나누어 떨어지면 3으로 나눈다.
            //1-1. X를 3으로 나눈 나머지가 1이면 1을 빼고 처음부터!
            //2. X가 2ㄹㅗ(만) 나누어 떨어지면 2ㄹㅗ 나눈다.
            //3. 1을 뺀다.
            if(X%3==0){X = X/3; count++; continue;}
            if(X%3==1){X = X-1; count++; continue;}
            if(X%2==0){X = X/2; count++; continue;}
            X = X-1; count++;
        }
        return count;
    }
}
