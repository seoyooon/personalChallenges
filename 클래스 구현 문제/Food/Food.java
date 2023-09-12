package Q230809; /**
 * 음식 주문 시스템 프로그램
 * 1. 음식 이름, 가격, 주문수량 저장하는 필드 생성
 * 2. 주문한 음식 정보와 총 주문 금액을 계산하는 메서드 구현
 * 3. 주문 정보와 총 금액을 출력*/
import java.io.*;
import java.util.*;
public class Food {
    public static class Foods {
        public String name;
        public int price;
        public int order;

        public Foods() { // 28번 라인 오류 잡기

            this.name = null;
            this.price = 0;
            this.order = 0;
        }

        public Foods(String name, int price, int order) {
            this.name = name;
            this.price = price;
            this.order = order;
        }
    }

    public static void main(String[] args) throws Exception {

        String[] foodMenu = new String[3];
        int [] foodPrice = new int[3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Foods foods = new Foods(); // 객체 생성 (생성자 호출)

        for (int i = 0; i < 3; i++) {
        System.out.print((i + 1) + "번째 음식을 입력하세요 > ");
            foodMenu[i] = br.readLine();
        }

        for (int i = 0; i < 3; i++) {
        System.out.print((i + 1) + "번째 음식의 가격을 입력하세요 > ");
            foodPrice[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            System.out.print("주문하실 음식 이름을 입력해 주세요 > ");
            foods.name = br.readLine();

            if (foods.name.equals(foodMenu[0])) {
                System.out.print("주문 수량을 입력해 주세요 > ");
                int menu1 = Integer.parseInt(br.readLine());
                System.out.print("주문하신 " + foodMenu[0] + " "  + menu1 + "개의 가격은 " + (foodPrice[0] * menu1) + "원 입니다.");
                break;

            } else if (foods.name.equals(foodMenu[1])) {
                System.out.print("주문 수량을 입력해 주세요 > ");
                int menu2 = Integer.parseInt(br.readLine());
                System.out.print("주문하신 " + foodMenu[1] + " "  + menu2 + "개의 가격은 " + (foodPrice[1] * menu2) + "원 입니다.");
                break;

            } else if (foods.name.equals(foodMenu[2])) {
                System.out.print("주문 수량을 입력해 주세요 > ");
                int menu3 = Integer.parseInt(br.readLine());
                System.out.print("주문하신 " + foodMenu[2] + " " + menu3 + "개의 가격은 " + (foodPrice[2] * menu3) + "원 입니다.");
                break;

            } else {
                System.out.println("없는 메뉴입니다. 초기 메뉴로 돌아갑니다.");
            }
        }
    }
}

