package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int num = (int)Math.pow(i,2);
            if (num <= N && num >= M) {
                list.add(num);
            }
            if (num > N) {
                break;
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
