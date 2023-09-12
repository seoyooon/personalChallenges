package Q230830.P7;

public class Animal {
    String name;
    int age;

    public Animal() {
        this.name = null;
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void makeSound() { // 상속 받은 클래스에서 재정의하려면 상위 클래스에 메서드가 존재해야 함
        System.out.println("소리를 내다");
    }

    public void bark() {
        System.out.println("발자국을 따라서 짖다");
    }

    public void acariciar() {
        System.out.println("털");
    }
}
