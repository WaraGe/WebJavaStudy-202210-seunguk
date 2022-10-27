package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {

    private Scanner sc;

    public StudentService(Scanner sc) {
        this.sc = sc;
    }

    public void registerStudent() {
        String name;
        int kor;
        int math;
        int eng;

        System.out.println("[학생정보 등록]");
        System.out.print("이름: ");
        name = sc.nextLine();
        System.out.print("국어점수: ");
        kor = sc.nextInt();
        System.out.print("영어점수: ");
        eng = sc.nextInt();
        System.out.print("수학점수: ");
        math = sc.nextInt();

        Student student = new Student(name, kor, math, eng);

    }
}
