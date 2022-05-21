package keep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main2606 {
    //망함
    public static void main(String[] args) throws IOException {
        //입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //컴퓨터 대수
        int[] computer = new int[Integer.parseInt(br.readLine())];
        for (int i = 1; i <= computer.length; i++) {
            computer[i-1] = i;
        }

        //연결 쌍 수
        int[][] connection = new int[Integer.parseInt(br.readLine())][2];

        //연결 쌍
        for (int i = 0; i < connection.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            connection[i][0] = Integer.parseInt(st.nextToken());
            connection[i][1] = Integer.parseInt(st.nextToken());
        }

        //1과 연결된 컴퓨터 넣을 리스트
        HashSet<Integer> hs = new HashSet<>();

        //1과 직접 연결된 컴퓨터 넣기
        for (int i = 0; i < computer.length; i++) {
            if (connection[i][0] == 1) {
                hs.add(connection[i][1]);
            }
            if (connection[i][1] == 1) {
                hs.add(connection[i][0]);
            }
        }

        System.out.println(hs.size());
    }
}
