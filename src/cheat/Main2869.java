package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());    //낮에 올라가는 길이
        int B = Integer.parseInt(st.nextToken());    //밤에 미끄러지는 길이
        int V = Integer.parseInt(st.nextToken());    //나무 막대 길이

        int day = (V-B)/(A-B);  //소요 일수

        if((V-B)%(A-B)!=0){
            day ++;
        }

        System.out.println(day);
    }
}
