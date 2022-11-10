package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일")); // 객체주소를 students에 담아주기
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));
        

        /*
            1. 김혜진 학생의 학번을 출력
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경
            3. 20220001 학번이 존재한다면 해당 학생을 삭제
            
            set -> list 변환
            해당 list를 학번 순서에 맞게 정렬
        */

        //1.
        System.out.println("1번 문제 정답: ");
        String searchName = "김혜진";

        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println("김혜진 학번: " + student.getId());
                break;
            }
        }
        //2.
        System.out.println("2번 문제 정답: ");
        int searchNumber = 20220004;

        for (Student student : students) {
            if (student.getId() == searchNumber)
                student.setName("설민수");
                break;
        }
        System.out.println(students);

        //3.20220001 학번이 존재한다면 해당 학생을 삭제
        System.out.println("3번 문제 정답: ");
        searchNumber = 20220001;

//        for (Student student : students) {
//            if (student.getId() == SearchNumber)
//                students.remove("김준일");
//        }

//        boolean a = students.contains(new Student = students.remove(20220001));
//        System.out.println(a);

//        if(students.contains(SearchNumber)) {
//            students.remove(SearchNumber);
//        }

//        for (Student student : students) {
//            if (student.getId() == searchNumber) { // 여기까지 이해함
//                students.remove(students.indexOf(student));
//                break;
//            }
//        }

        for(Student student : students) {
            if(student.getId() == searchNumber) {
                students.remove(student);
                break;
            }
        }

        System.out.println(students);

        int cmpId = 20220000;
        int j = 0;

        List<Student> sortStudents = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++) {
            cmpId++;
            for(Student student : students) {
                if(student.getId() == cmpId) {
                    sortStudents.add(student);
                }
            }
        }
        System.out.println(sortStudents);

    }
}
