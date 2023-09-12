package Q230828.P2;

public class Tri extends Shape {
    public int height;
    public Tri(int length, int height) {
        super(length);
        this.height = height;
    }
    @Override
    public int getArea() { return ((super.length * this.height) / 2 ); }
}
