/**
 * 3명의 고객의 3번의 입출금을 입력 받아 현재 통장 잔액과 총 입금 출금 횟수 구하는 코드
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BANK {
    public static int ClientName = 3, ClientMoney = 3; // 둘 다 초기화 하거나 둘 다 초기화 하지 않거나, main 밖에 작성

    public static void main(String[] args) throws Exception {
        String[] clientName = new String[3];
        int[][] Money = new int[ClientName][ClientMoney];
        int[] depositCounts = new int[ClientName]; // 입금 내역을 저장하는 배열
        int[] withdrawalCounts = new int[ClientName]; // 출금 내역을 저장하는 배열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ClientName; i++) {
            System.out.print("고객의 정보를 입력해 주세요 > ");
            clientName[i] = br.readLine();
        }

        for (int i = 0; i < ClientName; i++) {
            for (int j = 0; j < ClientMoney; j++) {
                System.out.print(clientName[i] + "고객님의 입출금 금액을 입력해 주세요 > ");
                Money[i][j] = Integer.parseInt(br.readLine());

                if (Money[i][j] > 0) { // Money에 저장된 값이 양수이면
                    depositCounts[i]++; // 입금 내역을 저장하는 배열에 +1
                }
                else if (Money[i][j] < 0) { // Money에 저장된 값이 음수이면
                    withdrawalCounts[i]++; // 출금 내역을 저장하는 배열에 +1
                }
            }
        }

        for (int i = 0; i < ClientName; i++) {
            System.out.print(clientName[i] + " "); // 고객명 출력
            for (int j = 0; j < ClientMoney; j++) {
                System.out.print(Money[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < ClientName; i++) {
            int result = 0; // 잔액
            for (int j = 0; j < ClientMoney; j++) {
                result += Money[i][j];
            }
            System.out.println(clientName[i] + " 고객님의 잔액은 " + result + "원 입니다."
                    + "(입금 : " + depositCounts[i]
                    + "회, 출금 : " + withdrawalCounts[i] + "회)");
        }
    }
}