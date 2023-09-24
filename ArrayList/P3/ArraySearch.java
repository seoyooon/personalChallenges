package Q230920.P3;
import java.io.*;
import java.util.*;
/**
 * [Array]
 * 사용자가 입력한 7개의 문자를 저장하고, 검색할 문자를 입력받아 이게 존재하는지 출력합니다.
 * 존재하지 않는다면 없습니다.를, 존재한다면 n번째에 존재합니다.를 출력합니다.
 * */

public class ArraySearch {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("7개의 문자를 입력해 주세요");
        String input = br.readLine();

        boolean searching = false;
        char[] charArray = input.toCharArray();

        System.out.println("배열에 저장된 문자");
        for (int i = 0; i < 7; i++) {
            System.out.print(charArray[i] + " ");
        }

        System.out.print("\n" + "검색할 문자를 입력해 주세요 > ");
        String search = br.readLine();
        char searchChar = search.charAt(0);
        System.out.println(searchChar + "가 배열 charArray에 포함되어 있는지 확인합니다.");

        for (int i = 0; i < 7; i++) {
            if (searchChar == charArray[i]) {
                System.out.println(searchChar + "는 배열 charArray의 " + i + "번째 index에 위치하는 문자입니다.");
                searching = true;
                break;
            }
        }

        if (!searching) {
            System.out.println(searchChar + "는 배열 charArray에 존재하지 않는 문자입니다.");
        }
    }
}


