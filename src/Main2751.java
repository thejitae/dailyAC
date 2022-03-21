import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2751 {
    public static void main(String[] args) throws IOException {

        //failedAction();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int value :
                list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }

    private static void failedAction() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //int[] arr = new int[N];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            //arr[i] = sc.nextInt();
            arr.add(sc.nextInt());
        }

        //Arrays.sort(arr);
        Collections.sort(arr);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (int value :
                arr) {
            System.out.println(value);
        }

        sc.close();
    }
}
