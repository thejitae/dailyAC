import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sunday {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i)-'A';
            alphabet[num]++;
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                result = (char)(i+'A');
            } else if (max == alphabet[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
