package Q230828.P2;

public class Rect extends Shape {
    public Rect(int length) { super(length); }
    @Override
    public int getArea() { return (super.length * super.length);}
}
