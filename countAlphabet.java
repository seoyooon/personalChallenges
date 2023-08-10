/**
 * 문자열을 입력하면 문자열에 해당하는 알파벳이 각 몇개인지 출력하는 코드 짜기
 * */

import java.io.*;
public class countAlphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력받기
        System.out.print("소문자로 구성된 문자열을 입력하세요 > ");

        int[] alphabet = new int[26]; // a~z까지 총 26개의 소문자
        String inputString = br.readLine();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            // if (!('a' <= ch && ch <= 'z')) continue; // 1. 영어 소문자가 아니면 for문의 처음으로 돌아가라
            if ('a' <= ch && ch <= 'z') { // 2. 영어 소문자가 아닌 경우에만 수행하라
                int alphabetIndex = (inputString.charAt(i) - 97); // inputString을 char형태로 형변환해서 char 'a'값의 아스키코드값(97)을 빼서 index에 알파벳 위치로 저장
                alphabet[alphabetIndex]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("(" + (char)(i + 97) + " : " + (alphabet[i]) + ")"); // 배열은 0부터 시작하니 i + 97로 하면 a부터 출력 가능
        }
    }
}

/**
 * matches 함수 : 자바의 String 클래스에 포함된 메소드로 주어진 정규표현식과 문자열을 비교하여 패턴이 일치하는지의 여부를 반환하는 함수이다.
 * public boolean matches(String regex) 같이 사용
 * 문자열 전체가 패턴과 일치해야 true를 반환하고 일치하지 않으면 false를 반환한다.
 * ex.)
        if(!inputString.matches("[a-z]")) { // String inputString이 a~z외의 다른 문자가 포함되어있다면? 의 조건식
        System.out.println("ERORR : 올바른 소문자로만 입력해 주세요.");
        }

 * 아스키코드에서
 * 영어 소문자 'a' = 97 ~ 'z' = 122
 * 영어 대문자 'A' = 65 ~ 'Z' = 90

 * char[] 변수명 = 'String 변수명'.toCharArray(); -> String 타입의 변수를 char 타입 배열로 형변환

 */
