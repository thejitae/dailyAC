package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();  //필요 없어
        String name = br.readLine();
        char lastLetter = name.charAt(name.length()-1);
        boolean isZero = false;
        if (lastLetter=='q'||lastLetter=='w'||lastLetter=='e'||lastLetter=='r'||lastLetter=='t'
                ||lastLetter=='a'||lastLetter=='s'||lastLetter=='d'||lastLetter=='f'||lastLetter=='g'
                ||lastLetter=='z'||lastLetter=='x'||lastLetter=='c'||lastLetter=='v') {
            isZero = true;
        }
        if (isZero) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
