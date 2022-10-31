package j01_q.Student풀이;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "이성욱";

        s2.schoolName = "부경대";
        s2.studentCode = 20220001;
        s2.studentYear = 1;
        s2.name = "2성욱";

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

        s1.ShowStudentInfo();
        s2.ShowStudentInfo();




    }
}
