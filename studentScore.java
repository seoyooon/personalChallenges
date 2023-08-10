/**
 * 1. 학생 3명의 4과목 점수를 입력
 * 2. 각 학생의 평균 점수 구하기
 * 3. 각 과목의 평균 점수 구하기
 * 4. 다음 특강 필수 참여 인원과 과목 구하기(평균 점수가 가장 낮은 학생, 평균 점수가 가장 낮은 과목)
 * */
import java.io.*;
import java.util.*;

public class studentScore {
    public static class Student {
        String name;
        int korea;
        int english;
        int math;
        int etc;

        public Student(String name, int korea, int english, int math, int etc) {
            // 객체를 초기화할 때 사용하는 생성자
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
            this.etc = etc;
        }

        public double getAvg() {
            double result = this.korea + this.english + this.math + this.etc;
            return result / 4;
        }
    }

    public static int STD_SIZE = 3;
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[STD_SIZE];

        // Buffered 입력
        students[0] = new Student("A", 10, 20, 30, 40);
        students[1] = new Student("B", 55, 6, 77, 84);
        students[2] = new Student("C", 90, 81, 62, 36);

        // 전체 출력
        for (int i = 0;i < STD_SIZE;i++) {
            System.out.println(students[i].name + "\t"
                    + students[i].korea + "\t"
                    + students[i].english + "\t"
                    + students[i].math + "\t"
                    + students[i].etc + "\t"
                    + students[i].getAvg());
        }

        // 과목별 평균값
        // SUBJECT[0], student[n].korea;
        for (int j = 0;j < SUBJECT.length;j++) {
            System.out.print(getSubjectName(j) + " 평균 점수 : ");
            double total = 0;
            for (int i = 0; i < STD_SIZE; i++) {
                switch (j) {
                    case 0: total += students[i].korea; break;
                    case 1: total += students[i].english; break;
                    case 2: total += students[i].math; break;
                    case 3: total += students[i].etc; break;
                    default: break;
                }// students[i].score[j];
            }
            System.out.println(total / STD_SIZE);
        }
    }

    public static String[] SUBJECT = {"국어", "영어", "수학", "기타"};
    public static String getSubjectName(int index) {
        return SUBJECT[index];
    }
}