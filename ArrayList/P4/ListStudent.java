package Q230920.P4;
import Q230828.Main;

import java.io.*;
import java.util.*;

/**
 * [List]
 * 학생의 객체(이름, 나이)를 만들고 5개 저장합니다.
 * 이 리스트에 있는 모든 정보를 순서대로 출력해봅시다.
 * */
public class ListStudent {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> studentName = new ArrayList<>();

        System.out.println("학생 5명의 이름을 순서대로 입력하세요");
        for (int i = 0; i < 5; i++) {
            String Name = br.readLine();
            studentName.add(Name);
        }

        List<Integer> studentAge = new ArrayList<>();
        System.out.println("학생 5명의 나이를 순서대로 입력하세요");
        for (int i = 0; i < 5; i++) {
            int Age = Integer.parseInt(br.readLine());
            studentAge.add(Age);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 학생 이름 : " + studentName.get(i));
            System.out.println((i + 1) + "번째 학생 나이 : " + studentAge.get(i));
            System.out.println("-----------------------------------");
        }
    }
}
