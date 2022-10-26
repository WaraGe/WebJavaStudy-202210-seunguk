package Student풀이;

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear() {
        studentYear++;
        if (studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다");
            studentYear--;
//          void도 리턴이 가능
            return;
        }
        ShowStudentInfo();
    }

    void increaseStudentYear(int year) {
        studentYear += year;
        if (studentYear > 5) {
            System.out.println(year + "학년을 더하면" + studentYear + "되어서 5학년을 넘어섭니다");
            System.out.println();
            studentYear -= year;
            return;
        }
        ShowStudentInfo();
    }

    void ShowStudentInfo() {
        System.out.println("학생의 대학교는: " + schoolName + "학교 입니다");
        System.out.println("학생의 대학교 코드는: " + studentCode + " 입니다");
        System.out.println("학생의 학년는: " + studentYear + "학년 입니다");
        System.out.println("학생의 성함은: " + name + " 입니다");
        System.out.println();
    }
}
