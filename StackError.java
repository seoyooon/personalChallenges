/**
 * StackOverflowError : 스택 초과 오류(용량 초과)
 */

public class StackError {
    public static int Max = 100; // Max 값을 지정해 보면서 컴퓨터 스택 확인을 할 수 있음(내가 설계 가능한 범주 확인)
    public static void function(int n) {
        if (n == Max) return; // 원래 void를 쓰면 return값을 가지지 않는데 강제 종료를 위해 return 설정
        function(n + 1);
    }

    public static void main(String[] args) {
        function(1);
    }
}
