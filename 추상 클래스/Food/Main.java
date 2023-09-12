package Q230830.P8;

/**
 * Food interface 를 정의하세요.
 * 이 인터페이스는 메서드 cook를 가져야 합니다.
 * 이를 implement하여 Burger와 Pizza 클래스를 만들어보세요.
 * Burger 객체의 cook는 "Cooked patty in bun, add toppings."를 출력하며,
 * Pizza 객체의 cook은 "Dough, sauce, cheese, bake with toppings."를 출력합니다.
 * */

public class Main {
    public static void main(String[] args) throws Exception {
        Burger burger = new Burger();
        Pizza pizza = new Pizza();
        System.out.println(burger.cook());
        System.out.println(pizza.cook());
    }
}
