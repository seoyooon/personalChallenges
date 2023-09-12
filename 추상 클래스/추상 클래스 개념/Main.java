package Q230828.P1;

public class Main {
    public static abstract class A {
        // 추상 클래스 = 추상 메소드만 가지는 것은 X (구현된 메소드도 가질 수 있다.)
        public int id;

        public int getId() { return this.id; }
        // A의 공통점이긴 하지만, A가 직접 동작하는 경우는 없다.
        // 설계도처럼 틀만 잡아줌 -> 조상 클래스를 만들어줄 때 편리
        public abstract void calcul();
    }

    public class B extends A {
        // A에서 어떤 메소드를 오버라이딩해야할 지 일일이 확인 X
        // 자동적으로 필수 구현하라고 안내
        @Override
        public void calcul() {
            System.out.println("B calcul function call");
        }
    }
    public static void main(String[] args) throws Exception {
       // A a = new A(); // 객체를 만들 수는 없음. (부모)class의 정의를 전담한다.
    }
}
