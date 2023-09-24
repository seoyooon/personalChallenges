package Q230920.P4;
import Q230828.P1.Main;

import java.io.*;
import java.util.*;

/**
 * [Array]
 * 학생의 객체(이름, 나이)를 만들고 5개 저장합니다.
 * 이 리스트에 있는 모든 정보를 순서대로 출력해봅시다.
 * */
public class ArrayStudent {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] studentName = new String[5];
        String[] studentAge = new String[5];

        System.out.println("학생 5명의 이름을 순서대로 입력하세요");
        for (int i = 0; i < 5; i++) {
            studentName[i] = br.readLine();
        }

        System.out.println("학생 5명의 나이를 순서대로 입력하세요");
        for (int i = 0; i < 5; i++) {
            studentAge[i] = br.readLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번 학생의 이름 : " + studentName[i]);
            System.out.println((i + 1) + "번 학생의 나이 : " + studentAge[i] + "살");
            System.out.println("-----------------------------------------");
        }
    }
}
