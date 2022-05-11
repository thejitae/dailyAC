package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11728 {
    public static void main(String[] args) throws IOException {
        //입력 받을 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //2개 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] A = new int[Integer.parseInt(st.nextToken())];
        int[] B = new int[Integer.parseInt(st.nextToken())];

        //각 A, B배열 입력 받기
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A.length; i++) A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B.length; i++) B[i] = Integer.parseInt(st.nextToken());

        //새로운 배열에 A, B배열 넣기
        int[] result = new int[A.length + B.length];
        int count = 0;  //A 다음에 B를 넣어야 해서 쓰는 변수
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i];
            count++;
        }
        for (int i = 0; i < B.length; i++) {
            result[count] = B[i];
            count++;
        }

        //정렬
        Arrays.sort(result);

        //출력할 StringBuffer 만들기
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            if (i+1 != result.length) sb.append(result[i]).append(" ");
            if (i+1 == result.length) sb.append(result[i]);
        }

        //출력
        System.out.println(sb);
    }
}
