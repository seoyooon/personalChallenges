package Q230830.Practice;

import java.util.*;
import java.io.*;

public class P1 {
    public abstract class Phone {
        // 추상 클래스를 선언할 때는 abstract 키워드를 붙여야 하고,
        // new 연산자를 이용해서 객체를 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.
        public String owner; // 필드

        public Phone(String owner) { // 생성자
            this.owner = owner;
        }
        public void turnOn() { // 메소드
            System.out.println("폰 전원을 켭니다.");
        }

        public void turnOff() {
            System.out.println("폰 전원을 끕니다.");
        }
    }

    public class SmartPhone extends Phone { // 추상 클래스 상속 extends 사용
        public SmartPhone(String owner) { // 생성자
            super(owner);
            // new 연산자로 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될 때 super(...)를 호출해서
            // 추상 클래스 객체를 생성하므로 추상 클래스도 반드시 생성자가 있어야 함
        }

        public void internetSearch() { // 메소드
            System.out.println("인터넷 검색을 합니다.");
        }
    }

    public void main(String[] args) { // static 쓰면 오류 남,,, 이유는..?
        SmartPhone smartPhone = new SmartPhone("홍길동");
        // Phone의 생성자를 호출해서 객체를 생성할 수 없음 -> 자식 클래스인 smartPhone으로 객체를 생성해서 사용

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
