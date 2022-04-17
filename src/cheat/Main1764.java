package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main1764 {
    //cheat
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //듣도 못한 사람 넣을 해시셋
        HashSet<String> noHear = new HashSet<>();

        //듣도 못한 사람 수
        int N = Integer.parseInt(st.nextToken());

        //듣도 보도 못한 사람 넣을 어레이리스트
        ArrayList<String> noHearSee = new ArrayList<>();

        //보도 못한 사람 수
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            //noHear[i] = br.readLine();    시간 초과
            noHear.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String noSee = br.readLine();
            if(noHear.contains(noSee)){
                noHearSee.add(noSee);
            }
        }

        Collections.sort(noHearSee);
        System.out.println(noHearSee.size());
        for (int i = 0; i < noHearSee.size(); i++) {
            System.out.println(noHearSee.get(i));
        }

    }
}
