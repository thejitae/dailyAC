package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //26
        int cycle = 1;  //사이클 최소 1
        int ten = N/10; //십의 자리 수   2   6
        int one = N-(ten*10);   //일의 자리 수   6   8
        int M = ten + one;  //십의 자리와 일의 자리 수의 합 8   14
        int next = one*10 + (M-(M/10*10));  //68    84
        while (N != next) {
            ten = next/10;
            one = next-(ten*10);
            M = ten + one;
            next = one*10 + (M-(M/10*10));
            cycle++;
        }
        System.out.print(cycle);
    }
}
