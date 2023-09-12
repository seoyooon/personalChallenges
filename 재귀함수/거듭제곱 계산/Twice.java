package Q230830.P4;

import java.util.*;
import java.io.*;

/**[재귀함수 연습하기]
 * 거듭 제곱 계산
 * 주어진 실수 x와 정수 n에 대해 x의 n승을 계산하는 재귀 함수를 작성하세요. 거듭제곱은 x를 n번 곱한 값입니다.
 * */
public class Twice {

    public static double f(double x, int n) {
        if(n == 0 || n == 1) { // 0번 곱하거나 1번 곱하는 건 실수 그대로 출력되기 때문에
            return x;
        }
        else {
            return x * f(x, n - 1); // n이 2면 제곱이기 때문에 x * x여서 (n-1)로 계산
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("실수 x를 n번 곱한 값을 구하는 프로그램입니다. " + "\n"
                        + "실수 x를 입력해 주세요 > " );
        double x = Double.parseDouble(br.readLine());
        System.out.print("양의 정수 n을 입력해 주세요 > ");
        int n = Integer.parseInt(br.readLine());

        double result = f(x, n);
        System.out.println("실수 " + x + "를 " + n + "번 곱한 값은 " + result + "입니다.");
    }
}
