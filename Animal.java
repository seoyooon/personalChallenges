import java.util.*;
import java.io.*;

/** 동물 클래스 상속 받은 하위 클래스 만들기
 * 동물 (Animal) 클래스: 이름과 나이를 저장하는 필드를 가지며, 소리를 내다 (makeSound) 메서드를 가지고 있습니다.
 * 강아지 (Dog) 클래스: 동물 클래스를 상속받으며, 발자국을 따라서 짖다 (bark) 메서드를 오버라이딩하여 재정의합니다.
 * 고양이 (Cat) 클래스: 동물 클래스를 상속받으며, 털을 acariciar (purr) 메서드를 오버라이딩하여 재정의합니다.
 * */

public class Animal {
    public static class Animals {
        String name;
        int age;

        public Animals() {
            this.name = null;
            this.age = 0;
        }

        public Animals(String name, int age) {
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

    public static class Dog extends Animals {
        public Dog(String name, int age) {
            super(name, age);
        }
        @Override // 오버라이딩 할 때 입력
        public void bark() {
            System.out.println("짖다");
        }

    }

    public static class Cat extends Animals {
        public Cat(String name, int age) {
            super(name, age);
        }
        @Override
        public void acariciar() {
            System.out.println("고양이 털");
        }
    }

    public static void main(String[] args) {
        Animals animals = new Animals();
        Dog dog = new Dog("강아지", 5);
        Cat cat = new Cat("고양이", 3);

        animals.bark(); // sout 으로 출력하지 않음
        dog.bark();
        cat.bark(); // 재정의 되지 않은 상태라 부모 클래스에 정의된 내용이 출력됨
        animals.acariciar();
        cat.acariciar();
    }
}
