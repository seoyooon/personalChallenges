package Q230830.P7;
import Q230809.Animal;
import java.io.*;
import java.util.*;

/** 동물 클래스 상속 받은 하위 클래스 만들기
 * 동물 (Animal) 클래스: 이름과 나이를 저장하는 필드를 가지며, 소리를 내다 (makeSound) 메서드를 가지고 있습니다.
 * 강아지 (Dog) 클래스: 동물 클래스를 상속받으며, 발자국을 따라서 짖다 (bark) 메서드를 오버라이딩하여 재정의합니다.
 * 고양이 (Cat) 클래스: 동물 클래스를 상속받으며, 털을 acariciar (purr) 메서드를 오버라이딩하여 재정의합니다.
 * */

public class Main {
    public static void main(String[] args) {
        Animal.Animals animals = new Animal.Animals();
        Animal.Dog dog = new Animal.Dog("강아지", 5);
        Animal.Cat cat = new Animal.Cat("고양이", 3);

        animals.bark(); // sout 으로 출력하지 않음
        dog.bark();
        cat.bark(); // 재정의 되지 않은 상태라 부모 클래스에 정의된 내용이 출력됨
        animals.acariciar();
        cat.acariciar();
    }
}
