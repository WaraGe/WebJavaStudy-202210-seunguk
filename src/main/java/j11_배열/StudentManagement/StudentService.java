package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {

    private Scanner sc;
    private StudentRepository studentRepository;

    public StudentService(Scanner sc, StudentRepository studentRepository) {
        this.sc = sc;
        this.studentRepository = studentRepository;
    }

    public void registerStudent() {
        String name;
        int kor;
        int math;
        int eng;

        System.out.println("[학생 정보 등록]");
        System.out.print("이름: ");
        name = sc.nextLine();
        System.out.print("국어점수: ");
        kor = sc.nextInt();
        System.out.print("영어점수: ");
        eng = sc.nextInt();
        System.out.print("수학점수: ");
        math = sc.nextInt();
        sc.nextLine(); // 버퍼가 남아 있으므로 버퍼 날리기

        Student student = new Student(name, kor, eng, math);

//      student의 값을 studentRepository가 전달 받음
        studentRepository.addStudent(student);

    }

    public void showStudents() { //학생 정보 출력
//      getStudent에 있는 배열을 리턴 받음(학생 배열의 주소 값)
        Student[] students = studentRepository.getStudent();

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                student.showStudentInfo();
            }
        }
    }
    private int indexOf() {
        String name;
        System.out.print("이름을 입력하세요: ");
        name = sc.nextLine();

        return studentRepository.findStudentByName(name);
    }

    public void showStudent() {
        System.out.println("[학생 정보 이름으로 조회]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.getStudent(index).showStudentInfo();
        System.out.println("조회 완료");
        System.out.println();
    }

    public void deleteStudent() {
        System.out.println("[학생 정보 이름으로 삭제]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제 완료");
        System.out.println();
    }

    public void modifyStudent() {
        System.out.println("[학생 정보 이름으로 조회]");
        int index = indexOf();
        int kor;
        int math;
        int eng;

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }

        System.out.print("국어점수: ");
        kor = sc.nextInt();
        System.out.print("영어점수: ");
        eng = sc.nextInt();
        System.out.print("수학점수: ");
        math = sc.nextInt();
        sc.nextLine();

        Student updateStudent = new Student("null",kor,eng,math);

        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료");

    }
}
