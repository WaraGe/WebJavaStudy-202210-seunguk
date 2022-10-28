package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[0];
    }
    //    공간 있는지 확인
    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1){
            index = increaseArray();
        }

        students[index] = student;
    }
    //    공간이 없으면 생성
    private int indexOfEmpty() {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1];
        for(int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return students.length - 1;
    }

    public Student[] getStudent() {
        return students;
    }

    public int findStudentByName(String name) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                if (students[i].getName().equals(name)) {
                    //      해당학생이름이랑 같냐?
                    return i;
                }
            }
        }
        return -1;
    }

    public Student getStudent(int index) {
        return students[index];
    }

//  학생 정보 지우기
    public Student removeStudent(int index) {
        Student student = students[index];
        students[index] = null;

        return student;
    }

//  수정된 Student 수정
    public Student updateStudent(int index, Student updateStudent) {
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }


}
