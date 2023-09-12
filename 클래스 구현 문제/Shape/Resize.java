public class Resize {
    public static class Rectangle {
        double height;
        double width;

        public Rectangle() {
            this.height = 0;
            this.width = 0;
        }

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        // 사각형의 면적을 반환하는 메서드
        public double calculateArea() {

            return (this.height * this.width);
        }

        // 사각형의 둘레를 반환하는 메서드
        public double calculatePerimeter() {
            return (this.height + this.width) * 2;
        }

        // 주어진 비율에 따라 사각형의 크기를 조절하는 메서드
        public void resize(double scaleFactor) {
            this.height = this.height + scaleFactor;
            this.width = this.width + scaleFactor;
        }

        // 다른 사각형과 동일한 면적을 갖도록 조절하는 메서드
        public void resize(Rectangle otherRectangle) {
            this.height = otherRectangle.height;
            this.width = otherRectangle.width;
        }
    }

    public static void main(String[] args) {
        // 주어진 너비와 높이로 사각형 생성
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // 초기 사각형 정보 출력
        System.out.println("Initial Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // 사각형 크기 조절
        rectangle.resize(2.0);

        // 크기 조절 후 사각형 정보 출력
        System.out.println("\nResized Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // 다른 사각형과 동일한 면적을 갖도록 크기 조절
        Rectangle otherRectangle = new Rectangle(4.0, 6.0);
        rectangle.resize(otherRectangle);

        // 면적 조절 후 사각형 정보 출력
        System.out.println("\nRectangle with Same Area as Other Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

