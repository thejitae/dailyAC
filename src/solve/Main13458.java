package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        //int visor = 0;  //필요한 감독관의 최솟값
        long visor = 0;  //필요한 감독관의 최솟값 int 범위 초과할 수 있어서 long

//        N개의 시험장 마다
        int N = Integer.parseInt(br.readLine());

//        A[N]배열의 응시자 수
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

//        총 감독관은 B명 감시 가능 시험장 마다 1명만
//        부 감독관은 C명 감시 가능
        st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < A.length; i++) {    //N보다는 A.length가 직관적
//            A[i] = A[i] - B;
            A[i] -= B;
            visor++;
            /*
            while (A[i] > 0) {
//                A[i] = A[i] - C;
                A[i] -= C;
                visor++;
            }
//            시간 초과
            */
            if(A[i] > 0) {
                if (A[i] % C == 0) visor += A[i] / C;
                else if (A[i] % C != 0) visor += A[i] / C + 1;
            }
        }

        System.out.println(visor);
    }
}
