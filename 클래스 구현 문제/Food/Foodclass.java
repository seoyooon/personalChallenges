package Q230809;
import java.io.*;

/**
 * 음식 주문 시스템 프로그램
 * 1. 음식 이름, 가격, 주문수량 저장하는 필드 생성
 * 2. 주문한 음식 정보와 총 주문 금액을 계산하는 메서드 구현
 * 3. 주문 정보와 총 금액을 출력
 * */

public class Foodclass {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Foods foods = new Foods();

            System.out.print("음식명을 입력해 주세요 > ");
            String name = br.readLine();
            foods.setName();

            System.out.print("음식 가격을 입력해 주세요 > ");
            int price = Integer.parseInt(br.readLine());

            System.out.print("주문 수량을 입력해 주세요 > ");
            int order = Integer.parseInt(br.readLine());

            System.out.println("----------------------------------");
            System.out.println("* 주문 내역 확인 *");
            orderConfirmation(foods);
            System.out.println("----------------------------------");
        }

        public static void orderConfirmation(Foods foods) {
            System.out.println("- 음식명 : " + foods.getName());
            System.out.println("- 가격 : " + foods.getPrice() + "원");
            System.out.println("- 주문 수량 : " + foods.getOrder() + "개");
            System.out.println("- 지불하실 금액은 " + foods.getTotalAmount() + "원 입니다.");
        }
    }
