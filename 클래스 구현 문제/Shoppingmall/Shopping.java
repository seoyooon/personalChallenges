package Q230809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * (쇼핑) 배열의 크기는 3개 고정
 * 물품 : 사용자에게 직접 입력 받아서 사용
 * 출력 : 입력 받은 그대로 출력하는 로직
 * 함수 : 물품 전체 금액이 내가 갖고 있는 금액 이하면 결제 가능(내가 가진 금액도 입력)
 *
 * 변수 : 사용, 선언, 중첩 (실질적인 데이터 활용)
 * 함수 : main(static) - custom(static; main 같이)
 * class : 맴버 변수(속성값) - 멤버 함수(동작, 속성 값을 이용한)
 * */

public class Shopping {
    public static void main(String[] args) throws Exception {

        Shop[] shopping = new Shop[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 3; i++) {
            String productName = br.readLine();
            String exprtDate = br.readLine();
            int price = Integer.parseInt(br.readLine());
            shopping[i] = new Shop(productName, exprtDate, price);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("제품명 : " + shopping[i].getProductName() + " 유통기한 : " + shopping[i].getExprtDate() + " 제품 가격 : " + shopping[i].getPrice());
        }

        int total = 0;
        for (int i = 0; i < 3; i++) {
           total += shopping[i].getPrice();
        }
        System.out.println("총 가격 : " + total);

        int money = Integer.parseInt(br.readLine());
        if (total <= money) {
            System.out.println("구매 완료");
        }
        else {
            System.out.println("잔액 부족");
        }
    }

    public static class Shop {
        String productName;
        String exprtDate;
        int price;
        public Shop(String productName, String exprtDate, int price) {
            this.productName = productName;
            this.exprtDate = exprtDate;
            this.price = price;
        }

        public boolean canPay(int money) {
            return this.price <= money;
        }

        public String getProductName() { return this.productName; }
        public String getExprtDate() { return this.exprtDate; }
        public int getPrice() { return this.price; }
    }
}
