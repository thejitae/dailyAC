package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());   //듣못 사람 수
//        int M = Integer.parseInt(st.nextToken());   //보못 사람 수
//        String[] noHear = new String[N];    //듣못 사람 배열
//        String[] noSee = new String[M]; //보못 사람 배열
//
//        for (int i = 0; i < N; i++) {
//            noHear[i] = br.readLine();
//        }
//        for (int i = 0; i < M; i++) {
//            noSee[i] = br.readLine();
//        }
        int N = 3;
        int M = 4;
        String[] noHear = {"ohhenrie", "charlie", "baesangwook", "obama"};
        String[] noSee = {"baesangwook", "ohhenrie", "clinton"};
        int K = 0;  //중복된 사람 수
        String[] noHearSee = new String[K];

        search(noHear, noSee);
    }

    private static void search(String[] noHear, String[] noSee) {
        for (int i = 0; i < noHear.length; i++) {
            for (int j = 0; j < noSee.length; j++) {
                if(noHear[i].equals(noSee[j])){

                }
            }
        }
    }

}
