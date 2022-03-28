package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1654 {
    //1654
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        //int N = Integer.parseInt(br.readLine());
//        int K = Integer.parseInt(st.nextToken());   //가지고 있는 랜선의 수 K
//        int N = Integer.parseInt(st.nextToken());   //필요한 랜선의 수 N
//        int[] arr = new int[K]; //K개의 랜선 길이 배열
//
//        for (int i = 0; i < K; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
        int K = 4;
        int N = 11;
        int[] arr = {802, 743, 457, 539};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/11);
    }
}
