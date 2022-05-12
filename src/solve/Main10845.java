package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main10845 {
    public static void main(String[] args) throws IOException {
        //정수 입력 받을 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //정수 입력
        int N = Integer.parseInt(br.readLine());

        //push일 때 나눠줘야 하니까
        StringTokenizer st;

        //출력 준비
        StringBuilder sb = new StringBuilder();

        //출력 객체
        Queue<Integer> que = new LinkedList<>();

        //큐에 제일 마지막으로 들어가는 수
        int recentlyInput = -1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
//        push X:   정수 X를 큐에 넣는 연산이다.
                case "push" :
                    recentlyInput = Integer.parseInt(st.nextToken());
                    que.offer(recentlyInput);
                    break;

//        pop:      큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
//                  만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "pop" :
                    if(que.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(que.poll()).append('\n');
                    }
                    break;

//        size:     큐에 들어있는 정수의 개수를 출력한다.
                case "size" :
                    sb.append(que.size()).append('\n');
                    break;

//        empty:    큐가 비어있으면 1, 아니면 0을 출력한다.
                case "empty" :
                    sb.append(que.isEmpty()? 1 : 0).append('\n');
                    break;

//        front:    큐의 가장 앞에 있는 정수를 출력한다.
//                  만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "front" :
                    sb.append(que.isEmpty()? -1 : que.peek()).append('\n');
                    break;

//        back:     큐의 가장 뒤에 있는 정수를 출력한다.
//                  만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "back" :
                    sb.append(que.isEmpty()? -1 : recentlyInput).append('\n');
                    break;
            }
        }

        //출력
        System.out.println(sb);
    }
}