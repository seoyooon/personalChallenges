/** 도형 클래스를 상속받은 여러 도형 클래스들을 만들어보고, 각 도형의 면적을 계산하는 메서드를 오버라이딩하여 정의하세요.
 * 1. 도형 (Shape) 클래스: 면적을 계산하는 계산하다 (calculateArea) 메서드를 가지고 있습니다.
 * 2. 사각형 (Rectangle) 클래스: 도형 클래스를 상속받으며, 가로와 세로의 길이를 필드로 가지며 계산하다 메서드를 오버라이딩하여 넓이를 계산합니다.
 * 3. 원 (Circle) 클래스: 도형 클래스를 상속받으며, 반지름을 필드로 가지며 계산하다 메서드를 오버라이딩하여 원의 면적을 계산합니다.
 * */
public class Shape {
    // 자식 클래스들에서 공통으로 사용될 변수만 부모 클래스에 선언
    public static class Shapes {
        double area; // 면적을 저장할 변수 선언

        // 1. 면적을 계산하는 calculateArea 메서드 선언
        public double calculateArea() {
            return area;
        }
    }

    // 2. 도형(Shapes) 클래스를 상속받는 사각형(Rectangle)클래스 선언
    public static class Rectangle extends Shapes {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        @Override // 오버라이딩
        public double calculateArea() {
            return (width * height);
        }
    }

    // 3. 도형(Shapes) 클래스를 상속받는 원(Circle) 클래스 선언
    public static class Circle extends Shapes {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        @Override // 오버라이딩
        public double calculateArea() {
            return (radius * radius * 3.14);
        }
    }

        public static void main(String[] args) {
            Shape shape = new Shape();
            Rectangle rectangle = new Rectangle(5, 10);
            Circle circle = new Circle(15);

            // 사각형의 넓이와 원의 넓이를 저장할 변수 선언(calculateArea 메서드 활용)
            double rectangleArea = rectangle.calculateArea();
            double circleArea = circle.calculateArea();

            System.out.println("1. 사각형의 넓이는 : " + rectangleArea);
            System.out.println("2. 원의 넓이는 : " + circleArea);
    }
}
