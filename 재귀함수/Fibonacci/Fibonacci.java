package Q230830.P2;
import java.io.*;
import java.util.*;

/**
 * [재귀함수 연습하기]
 * 주어진 양의 정수 n에 대해 n번째 피보나치 수를 계산하는 재귀 함수를 작성하세요.
 * 피보나치 수열은 처음 두 숫자가 0과 1이며, 그 뒤의 숫자는 이전 두 숫자의 합으로 이루어지는 수열입니다.
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1)+F(n-2)(n>1)
 * */

public class Fibonacci {
    public static int f(int n) {
        if (n <= 1) { // n이 0, 1일 때는 각각 0, 1값이 나옴
            return n;
        } else
            return f(n - 1) + f(n - 2);
        }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("양의 정수 n을 입력해 주세요 > ");
        int n = Integer.parseInt(br.readLine());
        int result = f(n);
        System.out.println("F(" + n + ") = " + result);
    }
}