import java.util.Scanner;

public class Main2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++) {
            for(int j=a; j>=1; j--) {
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
			String str = "";
			for (int j = 0; j < num - i; j++) {
				str += " ";
			}
			for (int k = i; k > 0; k--) {
				str += "*";
			}
			System.out.println(str);
		}

    }
*/

}
