import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {
    public static void main(String[] args) throws IOException {
        //2581
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int primeSum = 0;
        int primeMin = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
             if(isPrime(i)){
                 primeSum += i;
                 if(primeMin == Integer.MAX_VALUE){
                     primeMin = i;
                 }
             }
        }

        if(primeSum==0){
            System.out.println(-1);
        }
        else{
            System.out.println(primeSum);
            System.out.println(primeMin);
        }

    }
    public static boolean isPrime(int number) {
        int primeParse = 0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                primeParse++;
            }
        }
        if(primeParse==2){
            return true;
        }
        else{
            return false;
        }
    }
}
