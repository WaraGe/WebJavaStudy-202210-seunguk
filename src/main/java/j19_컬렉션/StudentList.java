package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일")); // 객체주소를 students에 담아주기
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        //찾고자 하는 학생 꺼내기
        String SearchName = "김규민";

        for(Student student : students) {
            if (student.getName().equals(SearchName)) {
                System.out.println("김규민 학생의 학번: " + student.getId());
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getName().equals(SearchName)) {
                System.out.println("김규민 학생의 학번: " + student.getId());
                break;
            }
        }
        
        //20220002 학번의 학생을 지우고 학생 리스트 출력
        int SearchId = 20220002;
        
        for(Student student : students) {
            if(student.getId() == SearchId) { // 여기까지 이해함
                students.remove(students.indexOf(student)); 
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getId() == SearchId) {
                students.remove(i);
                break;
            }

        }

            System.out.println(students);
    }
}
