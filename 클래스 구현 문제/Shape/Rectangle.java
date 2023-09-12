import java.io.*;
import java.util.*;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return (width * height); // return = (대입연산자) 사용은 없는 문법이니 사용에 주의할 것
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("사각형 가로 길이를 입력하세요 > ");
        int width = Integer.parseInt(br.readLine());

        System.out.print("사각형 세로 길이를 입력하세요 > ");
        int height = Integer.parseInt(br.readLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("사각형의 넓이는 " + rectangle.getArea() + " 입니다.");
    }
}
