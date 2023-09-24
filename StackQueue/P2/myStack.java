package Q230920.StackQueue.P2;

import java.util.*;
import java.io.*;

/**[Stack - First In Last Out]
 * 사용자가 10개의 숫자를 입력하는데, 출력부의 가장 앞의 값보다 클 때만 추가해봅시다.
 * 이 때의 결과를 모두 출력해봅시다.
 * */

public class myStack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        System.out.print("Stack에 입력할 첫번째 숫자를 입력해 주세요 > ");
        int firstInput = Integer.parseInt(br.readLine());
        stack.push(firstInput);

        for (int i = 0; i < 9; i++) {
            System.out.print("Stack에 저장할 숫자를 입력해 주세요 > ");
            int input = Integer.parseInt(br.readLine());

            if (stack.peek() < input) {
                stack.push(input);
                System.out.println("Saved");
            }

            else {
                System.out.println("Not be saved");
            }
        }

        System.out.println("Stack에 저장된 숫자");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
