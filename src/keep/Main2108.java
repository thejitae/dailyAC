package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2108 {
//        산술평균 : N개의 수들의 합을 N으로 나눈 값
        static int sum; //합
//        중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        static int mid;
//        최빈값 : N개의 수들 중 가장 많이 나타나는 값
        static int freq;
//        범위 : N개의 수들 중 최댓값과 최솟값의 차이
        static int range;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[Integer.parseInt(br.readLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        sum = sum/arr.length;

        Arrays.sort(arr);
        mid = arr[(arr.length-1)/2];
        range = arr[arr.length-1]-arr[0];

        sb.append(sum).append('\n');
        sb.append(mid).append('\n');
        sb.append(freq).append('\n');
        sb.append(range).append('\n');

        System.out.println(sb);

    }
}
