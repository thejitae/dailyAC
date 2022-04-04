package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double[] score = new double[Integer.parseInt(br.readLine())];   //점수 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   //각 과목 점수

        double newSum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(score);

        for (int i = 0; i < score.length; i++) {
            newSum += score[i]/score[score.length-1]*100;
        }

        System.out.println(newSum/score.length);
    }
}
