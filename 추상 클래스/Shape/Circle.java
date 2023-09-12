package Q230828.P2;

public class Circle extends Shape {
    public Circle(int length) {
        super(length);
    }
    @Override
    public int getArea(){
        return (int)(super.length * 3.14);
    } // 3.14가 double형이므로 (int)를 사용하여 casting(형변환)
}
