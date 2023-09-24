package Q230920.StackQueue.P1;

import java.util.*;
import java.io.*;

/**[Stack - First In Last out]
 * 사용자가 10개의 숫자를 순서대로 입력해서, 모두 꺼냈을 때의 내용을 출력해보세요.
 * */

public class myStack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        System.out.println("10개의 정수를 입력해 주세요 > ");

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            stack.push(input);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
