package cheat;

public class Main4673 {

    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if(n < 10001) {
                arr[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }



    private static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num%10);
            num = num/10;
        }

        return sum;
    }

}