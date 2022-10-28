package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StudentRepository studentRepository = new StudentRepository(); 동일하기에 서비스에 대입

        // studentservices를 생성하고, 스캐너, repository를 불러온다.
        StudentService studentService = new StudentService(sc, new StudentRepository());

        String select = null;

        while(true){
            System.out.println("[학생 관리 프로그램 메뉴]");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 조회");
            System.out.println("q. 종료");
            System.out.println();
            System.out.print("번호를 입력해주세요: ");
            select = sc.nextLine();
            if(select.equals("q")){
                break;
            }else if(select.equals("1")){
                studentService.showStudents();
            }else if(select.equals("2")){
                studentService.registerStudent();
            }else if(select.equals("3")){
                studentService.modifyStudent();
            }else if(select.equals("4")){
                studentService.deleteStudent();
            }else if(select.equals("5")){
                studentService.showStudent();
            }else {
                System.out.println("선택하신 번호의 명령이 없습니다");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

        System.out.println("프로그램이 종료되었습니다.");

    }
}
