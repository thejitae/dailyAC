package cheat;

import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main7785 {
    //https://lotuslee.tistory.com/110
    //70% 이상 베껴따... ㅎ ㅏ...
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String log = input[1];

            if (log.equals("enter")){
                set.add(name);
            }
            if (log.equals("leave")){
                if (set.contains(name)){
                    set.remove(name);
                }
            }
        }

        List<String> list = new ArrayList<>();
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            list.add(iter.next());
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb);
//        입력
//        4
//        Baha enter
//        Askar enter
//        Baha leave
//        Artem enter

//        출력
//        Askar
//        Artem

    }
}
