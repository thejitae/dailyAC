package cheat;

import java.util.Scanner;

//2525
public class Main2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int oven = sc.nextInt();

        mm += oven;
        if(mm>=60){
            while(mm>=60){
                mm-=60;
                hh++;
                if(hh>=24){
                    hh=0;
                }
            }
        }

        System.out.println(hh+" "+mm);

    }
}
