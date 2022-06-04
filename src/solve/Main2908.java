package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int Ahun = A/100;
        int Aten = (A-Ahun*100)/10;
        int Aone = A-Ahun*100-Aten*10;
        int Arev = Aone*100+Aten*10+Ahun;
        int B = Integer.parseInt(st.nextToken());
        int Bhun = B/100;
        int Bten = (B-Bhun*100)/10;
        int Bone = B-Bhun*100-Bten*10;
        int Brev = Bone*100+Bten*10+Bhun;
        if (Arev > Brev) {
            System.out.println(Arev);
        } else {
            System.out.println(Brev);
        }
    }
}
