package Q230828.P2;

public abstract class Shape {
    public int length;
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract int getArea();
    // 추상 메소드
    public Shape(int length) {
        this.length = length;
    }

    public Shape() {
        this.length = 0;
    }
}
