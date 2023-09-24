package Q230920.P1;
import java.io.*;
import java.util.*;

/**
 * [List]
 * 사용자가 입력한 5개의 문자를 저장하고, 역순으로 출력해보세요.
 * */

public class ListReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new ArrayList<>();

        System.out.print("5개의 문자를 입력해 주세요 > ");
        String input = br.readLine();

        for (int i = 0; i < 5; i++) {
            char charList = input.charAt(i);
            list.add(charList);
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
