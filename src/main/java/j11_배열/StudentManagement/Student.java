package j11_배열.StudentManagement;

public class Student {

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int totalScore;
    private int avgScore;
    private char grade;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        calculation();
    }

    public void updateStudent(Student updateStudent) {
//      getter, setter가 필요없음
        this.kor = updateStudent.kor;
        this.eng = updateStudent.eng;
        this.math = updateStudent.math;

        calculation();
    }

    private void calculation() {
        setTotalScore();
        setAvgScore();
        setGrade();
    }

    private void setTotalScore() {

        totalScore = kor + math + eng;
    }

    private void setAvgScore() {
        avgScore = totalScore / 3;
    }

    private void setGrade() {
        if(avgScore > 89) {
            grade = 'A';
        }else if(avgScore > 79) {
            grade = 'B';
        }else if(avgScore > 69) {
            grade = 'C';
        }else if(avgScore > 59){
            grade = 'D';
        }else {
            grade = 'F';
        }
    }

    public void showStudentInfo() {
        System.out.println("[학생 정보 출력]");
        System.out.println();
        System.out.println("이름: " + name);
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);
        System.out.println("총점: " + totalScore);
        System.out.println("평균점수: " + avgScore);
        System.out.println("학점: " + grade);
        System.out.println();
    }

    public String getName() {
        return name;
    }

}
