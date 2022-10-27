package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[1];
    }
    //    공간 있는지 확인
    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1){
            increaseArray();
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

        return tempArray.length - 1;
    }

}
