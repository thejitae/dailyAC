import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //1 2 3 4 5 6 7 8 ascending
        //8 7 6 5 4 3 2 1 descending
        //나머지 mixex
        int[] note = new int[8];
        String result = "";
        for (int i = 0; i < 8; i++) {
            note[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 7; i++) {
            if (note[i] == note[i+1] - 1){
                result = "ascending";
            } else if (note[i] == note[i+1] + 1){
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
