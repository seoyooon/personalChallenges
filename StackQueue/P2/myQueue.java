package Q230920.StackQueue.P2;

import java.util.*;
import java.io.*;

/**[Queue - First In First Out]
 * 사용자가 10개의 숫자를 입력하는데, 출력부의 가장 앞의 값보다 클 때만 추가해봅시다.
 * 이 때의 결과를 모두 출력해봅시다.
 * */

public class myQueue {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Queue에 입력할 첫번째 숫자를 입력해 주세요 > ");
        int firstInput = Integer.parseInt(br.readLine());
        queue.offer(firstInput);

        for (int i = 0; i < 9; i++) {
            System.out.print("Queue에 저장할 숫자를 입력해 주세요 > ");
            int input = Integer.parseInt(br.readLine());

            if (queue.peek() < input) {
                queue.offer(input);
                System.out.println("Saved");
            }

            else {
                System.out.println("Not be saved");
            }
        }

        System.out.println("Queue에 저장된 숫자");
       while(queue.size() != 0) {
            System.out.print(queue.poll() + " ");
        }
    }
}
