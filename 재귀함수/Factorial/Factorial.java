package Q230830.P1;
import java.io.*;
import java.util.*;

/**[재귀함수 연습하기]
 * 팩토리얼 계산하기:
 * 주어진 양의 정수 n의 팩토리얼을 계산하는 재귀 함수를 작성하세요.
 * 팩토리얼은 1부터 n까지의 모든 양의 정수를 곱한 값을 의미합니다.*/

public class Factorial {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

            System.out.print("정수 n을 입력하세요(단, n > 0) : ");
            int n = Integer.parseInt(reader.readLine());

            if (n <= 0) {
                System.out.println("[ERROR] 잘못된 입력입니다.");
            } else {
                int multiply = f(n);
                System.out.println(n + "의 팩토리얼은 " + multiply + " 입니다.");
            }
    }

    public static int f(int n) { // 재귀함수는 반복문의 개념과 비교하면 됨
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }
}
