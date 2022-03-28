package cheat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1978 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int input = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        int primeNumber = 0;
        for (int i = 0; i < N; i++) {
            input = sc.nextInt();
            arr.add(input);



            int prime = 0;
            for (int j = 1; j <= input; j++) {
                if(arr.get(i)%j==0){
                    prime++;
                }
            }
                if(prime == 2){
                    primeNumber++;
                }
        }

        System.out.println(primeNumber);

    }
}
