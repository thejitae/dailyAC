import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1920 {

    public static void main(String[] args) throws IOException {

        /*
        1920
        문제
        N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때,
        이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

        입력
        첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다.
        다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
        다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
        다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
        모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
        5
        4 1 5 2 3
        5
        1 3 7 9 5

        출력
        M개의 줄에 답을 출력한다.
        존재하면 1을, 존재하지 않으면 0을 출력한다.
        1
        1
        0
        0
        1

        */
        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //5
        int[] arr = new int[N]; //4 1 5 2 3

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();   //5
        int[] arrr = new int[M];    //1 3 7 9 5

        for (int i = 0; i < M; i++) {
            arrr[i] = sc.nextInt();
        }

        boolean hasNumber = false;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i]==arrr[j]){
                    hasNumber = true;
                }

            }
            if(hasNumber){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }

        sc.close();
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int[] arrr = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()))>=0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }
}
