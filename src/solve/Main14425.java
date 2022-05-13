package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main14425 {
    public static void main(String[] args) throws IOException {
        //입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N, M 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //집합 S에 포함되는 문자열 N개
        int N = Integer.parseInt(st.nextToken());
        HashSet<String> S = new HashSet<>();

        //검사 대상 문자열 M개
        int M = Integer.parseInt(st.nextToken());
        String[] check = new String[M];

        //집합 S 입력
        for (int i = 0; i < N; i++) {
            S.add(br.readLine());
        }

        //출력할 교집합 정수 count
        int count = 0;

        //검사 대상 입력
        for (int i = 0; i < M; i++) {
            check[i] = br.readLine();
            if (S.contains(check[i])) count++;
        }

        //출력
        System.out.println(count);
    }
}
