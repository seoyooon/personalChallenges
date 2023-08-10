/**[구현 집중 문제]
 * 사용자에게 ID, PW를 입력받고 틀린 답을 입력할 경우 계속 입력을 요청, 정상 ID, PW일 때 로그인에 성공하는 코드
 * */

import java.io.*;
public class login {
    public static void main(String[] args) throws Exception {

        String ID = "test";
        String PW = "password";
        // 정해진 아이디와 패스워드 선언 후

        String userID;
        String userPW;
        // 입력받고 정해진 아이디, 패스워드 값과 일치하는지 비교할 String 값을 따로 선언해 주어야 함.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) { // true일 경우 계속 반복하는 while-true문 활용
            System.out.print("ID : ");
            userID = br.readLine();

            if(userID.equals(ID)) { // String은 대입연산자 '='를 사용하지 않고 .equals를 사용해준다!
                System.out.print("PW : ");
                userPW = br.readLine();
                if(userPW.equals(PW)) {
                    System.out.println("로그인에 성공했습니다.");
                    break; // 로그인 성공시 break; 아니면 다시 반복하도록 while(true)문 사용
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
                }
            }
            else {
                System.out.println("존재하지 않는 아이디입니다. 확인 후 다시 입력해 주세요.");
            }
        }
    }
}

