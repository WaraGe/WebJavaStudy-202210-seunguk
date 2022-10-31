package j01_q.문제;

public class Student {

    //Properties(속성) - (멤버)변수
    /*
    schoolName
    studentCode
    schoolName
    studentYear
    */
    String schoolName;
    int studentCode;
    int studentYear = 0;
    String name;


    //Function(기능) - (맴버)메소드
    /*
    increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
    showStudentInfo() - 학생 정보 출력
    */
    void increaseStudentYear() {
        if (studentYear < 5){
            studentYear++;
        }else if(studentYear == 5) {
            System.out.println("최대 학년 입니다");
            System.out.println();
            studentYear--;
            return;
        }
        System.out.println("이제부터"+studentYear+"학년 입니다");
    }
    void increaseStudentYear(int year) {
        studentYear += year;
        if (studentYear > 5) {
            System.out.println("최대 학년 입니다");
            System.out.println();
            studentYear -= year;
            return;
        }
    }
    void showStudentInfo() {
        System.out.println("학생의 대학교는: " + schoolName + "학교 입니다");
        System.out.println("학생의 대학교 코드는: " + studentCode + " 입니다");
        System.out.println("학생의 학년는: " + studentYear + "학년 입니다");
        System.out.println("학생의 성함은: " + name +" 입니다");
        System.out.println();
    }
}
