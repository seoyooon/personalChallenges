package Q230920.P2;
import java.io.*;
import java.util.*;

/**
 * [List]
 * 사용자가 입력한 10개의 숫자를 저장하고, 이에 대한 평균을 계산해보세요.
 * */

public class ListNum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> list = new ArrayList<>();

        double sum = 0;

        System.out.println("숫자 10개를 입력해 주세요");

        for (int i = 0; i < 10; i ++) {
            System.out.print((i + 1) + "번째 숫자를 입력해 주세요 > ");
            double input = Double.parseDouble(br.readLine());
            list.add(input);
        }

        System.out.println("List에 저장된 숫자");
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
            sum += list.get(i);
        }

        double aver = sum / 10;
        System.out.println("\n" + "list에 저장된 숫자의 평균은 : " + aver + "입니다.");
    }
}
