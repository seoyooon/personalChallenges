package Q230920.P2;
import java.io.*;
import java.util.*;


/**
 * [Array]
 * 사용자가 입력한 10개의 숫자를 저장하고, 이에 대한 평균을 계산해보세요.
 * */

public class ArrayNum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] doubleArray = new double[10];
        double sum = 0;

        System.out.println("숫자 10개를 입력해 주세요");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력해 주세요 > ");
            doubleArray[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("배열에 저장된 숫자 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(doubleArray[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            sum += doubleArray[i];
        }

        double aver = sum / 10;
        System.out.println("\n" + "배열에 저장된 모든 숫자의 평균 값은 : " + aver + "입니다.");
    }
}
