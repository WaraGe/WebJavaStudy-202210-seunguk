package 문제;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "이성욱";
        student1.studentCode = 12341234;
        student1.schoolName = "부산대";
        student1.studentYear = 1;

        student2.name = "2성욱";
        student2.studentCode = 10000000;
        student2.schoolName = "울산대";
        student2.studentYear = 1;

        student1.increaseStudentYear();
        student1.increaseStudentYear();
        student1.increaseStudentYear();
        student1.increaseStudentYear();
        student1.increaseStudentYear();
        student1.increaseStudentYear();

        student2.increaseStudentYear();

        student1.showStudentInfo();
        student2.showStudentInfo();


    }


}
