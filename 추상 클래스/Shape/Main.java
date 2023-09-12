package Q230828.P2;

/**
 * 정다각형이라고 가정하고 진행
 * if Circle의 길이는 반지름
 * if Triangle의 길이는 한 변의 길이
 * if Rectangle의 길이는 한 변의 길이
 * Shape 클래스, Circle, Triangle, Rectangle의 메소드를 만들어 보자
 * method : getArea(); 만 만들기
 * Circle : r * 3.14
 * Triangle : 0.5 * l * l;
 * Rectangle : l * l;
 * */

public class Main {
    public static void main(String[] args) throws Exception {

    // 추상 클래스에서는 new 연산자 사용이 안 되므로, 자식 클래스에서 객체를 생성해서 메소드 호출하기
    Circle circle = new Circle(5);
    Tri tri = new Tri(4,5);
    Rect rect = new Rect(6);


        System.out.println("원의 넓이 : " + circle.getArea()); // 원의 넓이는 int로 형변환한 상태라 소숫점 생략하고 출력됨
        System.out.println("삼각형의 넓이 : " + tri.getArea());
        System.out.println("사각형의 넓이 : " + rect.getArea());
    }
}
