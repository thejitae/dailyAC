package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //도달하는 방 번호
        //1 1
        //7 2 6
        //19 3 12
        //37 4 18
        //61 5 24
        //91 6 30
        int move = 1;   //이동 최소 칸
        int range = 2;    //최소 범위


        if(N==1){
            System.out.println(1);
        }
        else{
            while(range <= N){
                range = range + (6 * move);
                move++;
            }
            System.out.println(move);
        }
    }
}