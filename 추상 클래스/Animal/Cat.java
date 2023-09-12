package Q230830.P7;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void acariciar() {
        System.out.println("고양이 털");
    }
}
