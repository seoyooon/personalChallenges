package Q230809;

import java.io.*;
import java.util.*;
/** 온라인 쇼핑몰의 상품 정보를 관리하는 클래스 작성
 * 1. 상품 클래스에는 상품명, 가격, 재고량 등의 정보를 저장하는 필드가 있어야함
 * 2. 재고를 관리하고 상품 정보를 출력하는 메서드 구현
 * 3. 쇼핑몰 상품 클래스를 정의하고 샘플 상품을 생성하여 상품 정보와 재고 상황을 출력하는 프로그램 작성
 * 4. 캡슐화 하기 (X...)
 * */
public class Shoppingmall {
    public static class Shoppingmalls {
        public String productName;
        public int productPrice;
        public int productStock;

        public Shoppingmalls() {
            this.productName = null;
            this.productPrice = 0;
            this.productStock = 0;
        }

        public Shoppingmalls(String productName, int productPrice, int productStock) { // 왜 사용이 안 됐다고 뜨는지..?
            this.productName = productName;
            this.productPrice = productPrice;
            this.productStock = productStock;
        }

        public String getProductName() {
            return productName;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public int getProductStock() {
            return productStock;
        }
    }

        // 상품을 입력하고 상품의 현재 이름, 가격, 재고량을 출력하는 메서드
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Shoppingmalls shoppingmalls = new Shoppingmalls();

            System.out.print("상품명을 입력해 주세요 > ");
            shoppingmalls.productName = br.readLine();

            System.out.print("상품 가격을 입력해 주세요 > ");
            shoppingmalls.productPrice = Integer.parseInt(br.readLine());

            System.out.print("상품 재고 수량을 입력해 주세요 > ");
            shoppingmalls.productStock = Integer.parseInt(br.readLine());

            System.out.println("----------------------------------");
            System.out.println("* 입력한 상품 정보 *");
            inventoryStatus(shoppingmalls);
            System.out.println("----------------------------------");
        }

        // 1. 상품 재고 관리 클래스 -> 상품명, 가격, 재고량 등의 정보를 저장하는 필드
        public static void inventoryStatus(Shoppingmalls shoppingmalls) {
            System.out.println("- 상품명 : " + shoppingmalls.getProductName());
            System.out.println("- 가격 : " + shoppingmalls.getProductPrice() + "원");
            System.out.println("- 재고 : " + shoppingmalls.getProductStock() + "개");
        }
}
