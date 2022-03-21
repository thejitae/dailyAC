import java.util.Scanner;

public class Main1712 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();//fixable
        int B = sc.nextInt();//variable
        int C = sc.nextInt();//price

        if(B>=C){
            System.out.println(-1);
        }else{
            System.out.println(A/(C-B)+1);
        }

    }
}
