package Q230920.P3;
import java.io.*;
import java.util.*;
/**
 * [List]
 * 사용자가 입력한 7개의 문자를 저장하고, 검색할 문자를 입력받아 이게 존재하는지 출력합니다.
 * 존재하지 않는다면 없습니다.를, 존재한다면 n번째에 존재합니다.를 출력합니다.
 * */
public class ListSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new ArrayList<>();

        boolean searching = false;

        System.out.println("7개의 문자를 입력해 주세요");
        String input = br.readLine();

        for (int i = 0; i < 7; i++) {
            char charList = input.charAt(i);
            list.add(charList);
            System.out.println(list.get(i));
        }

        System.out.print("\n" + "검색할 문자를 입력해 주세요 > ");
        String search = br.readLine();
        char SearchList = search.charAt(0);
        System.out.println(SearchList + "가 list에 포함되어 있는지 확인합니다.");

        for (int i = 0; i < 7; i++) {
            if (SearchList == list.get(i)) {
                System.out.println(SearchList + "는 list의 " + (i + 1) + "번째에 위치하는 문자입니다.");
                searching = true;
                break;
            }
        }

        if(!searching) {
            System.out.println(SearchList + "는 list에 존재하지 않는 문자입니다.");
        }
    }
}


