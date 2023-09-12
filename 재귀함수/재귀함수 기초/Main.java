package Q230828;
import java.io.*;
import java.util.*;
public class Main {
    public static int END;
    public static int f(int i) {
        if (i < END) return 0; // true 실행 되었다면, 아래는 무조건 수행 X
        return i + f(i + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        END = Integer.parseInt(br.readLine());
        System.out.println(f(1));
    }
}
