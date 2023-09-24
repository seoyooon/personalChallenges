package Q230920.P1;

import java.io.*;

/**
 * [Array]
 * 사용자가 입력한 5개의 문자를 저장하고, 역순으로 출력해보세요.
 * */

public class ArrayReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("5개의 문자를 입력해 주세요 > ");
        String input = br.readLine();

        char[] charArray = input.toCharArray();

        for (int i = 4; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }
}
