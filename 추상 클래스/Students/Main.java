package Q230830.P9;
/**
 * Student 인터페이스를 정의하세요. 이는 메서드 take_exam을 가져야 합니다.
 * 이 인터페이스를 구현하여 HighSchoolStudent와 CollegeStudent 클래스를 만들어보세요.
 * HighSchool의 만점은 100점이며, College의 만점은 4.5입니다.
 * take_exam의 파라미터는 상위의 퍼센트를 입력하며, 그에 알맞는 점수를 출력합니다.
 * */

public class Main {
    public static void main(String[] args) throws Exception {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        CollegeStudent collegeStudent = new CollegeStudent();
        System.out.println("High School top 20% score : " + highSchoolStudent.take_exam() * 0.8); // 100점의 상위 20%에 해당하는 점수
        System.out.println("College top 20% score : " + (collegeStudent.take_exam() * 0.8)); // 4.5점의 상위 20%에 해당하는 점수
    }
}
