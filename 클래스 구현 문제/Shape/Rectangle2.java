import java.io.*;
public class Rectangle2 { // Rectangle2 의 Class는 main을 동작시키는 역할
    public static class Rectangles { // main과 동등한 위치의 Class 새로 선언
        public int width;
        public int height;

        public Rectangles(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getArea() {
            return (width * height);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("사각형의 가로 길이를 입력하세요 > ");
        int width = Integer.parseInt(br.readLine());

        System.out.print("사각형의 세로 길이를 입력하세요 > ");
        int height = Integer.parseInt(br.readLine());

        Rectangles rectangles = new Rectangles(width, height);

        System.out.println("사각형의 넓이는" + rectangles.getArea() + "입니다.");
    }
}
