package Q230830.P7;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override // 오버라이딩 할 때 입력
    public void bark() {
        System.out.println("짖다");
    }
}
