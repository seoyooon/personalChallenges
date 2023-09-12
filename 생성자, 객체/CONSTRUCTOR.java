package Q230822;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 생성자 (권한 -> public, private ... )
 * <class - name> (동작 함수 -> 오버 로딩 가능)
 * 1) 시점 : 'new'키워드의 동작함
 * 2) 목표(역할) : 객체를 생성해서 정의내릴 때
 *  ex.) 선언 -> int a;
 *      초기화 -> a = 5;
 *      선언 & 초기화 -> int a = 5;
 *
 *  ex.)
 *  (1) Object o = new Object(); => 아무것도 없는 생성자에 new를 해줘서 기본 생성자만 만듬(공간만 할당해둔 상태 비어있음)
 *      o.setName(name); => Object에 name을 setting해준다. (변수 초기화를 같이 하는 개념과 유사함)
 *
 *  (2) Object o2 = new Object(name, id, age); => 생성과 초기화를 한번에 하는 것(괄호 안의 생성자는 오버로딩하는 다중 생성자임)
 * */
public class CONSTRUCTOR {
    public static class Student {
        // 멤버 변수 - 객체의 개별적인 개념
        private int id; // 학생의 아이디(학번) -> 정보 은닉을 위해 private 사용
        private int age; // 학생의 나이
        private String name; // 학생의 이름

        public Student() {
            // 기본 생성자 - 파라미터 없음 -> 직접 초기화 해줘야 함 (51번 라인을 작성했을 때 뜨는 오류를 잡는 방법)
            this.id = 0;
            this.age = 0;
            this.name = null;
            System.out.println("파라미터가 없는 생성자");
        }

        public Student(int id, int age, String name) {
            // 오버로딩 된 생성자 - 파라미터 종류 / 개수 달라야 함
            this.id = id;
            this.age = age;
            this.name = name;
            System.out.println("파라미터가 있는 생성자");
        }

        // 멤버 함수 - 객체만의 고유한 (멤버 변수를 활용한) 동작/결과물
        // 캡슐화 - 멤버 변수에 직접 접근 X (getter - 가져오다, setter - 설정하다)

        // getter, setter - main의 입장에서 get / set 하는 동작 (사용자의 입장에서)
        // getter : 내가 정의 내렸던 멤버 변수의 값을 가져온다 (항상 return이 존재하기 때문에 void가 아니라 int, String 등의 값을 가짐)
        public int getId() { // 파라미터 X
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        // setter : 멤버 변수의 값을 재정의한다. (update 개념, 파라미터가 무조건 존재해야한다., void로 고정)
        public void setId(int id) { // 파라미터 O
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생의 나이를 출력해라 => Student 객체 1개 (멤버 함수)
        // 학생의 평균 나이를 출력해라 => 여러 객체를 확인 (일반 함수)

        // (1) 아무 데이터가 없는 객체를 생성하고 값 입력해주기
//        Student student = new Student(); // 아무런 데이터가 없는 객체 생성(기본 생성자 - 안이 비어있음)
//
//        int id = Integer.parseInt(br.readLine()); // 기존에 Student에 있던 id 값이 아니라 새로운 id를 가져옴
//        student.setId(id); // 키보드 입력을 받을 때 셋팅 값을 입력해 줘야함.
//
//        int age = Integer.parseInt(br.readLine());
//        student.setAge(age);
//
//        String name = br.readLine();
//        student.setName(name);


        // (2) 생성과 초기화 동시에 진행하기
        int id = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());
        String name = br.readLine();
        Student student = new Student(id, age, name); // 호출은 오버로딩 된 생성자가 된 것임
    }
}
