package j19_컬렉션;

import java.util.*;

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

        for (Student student : students) {
            if (student.getName().equals(SearchName)) {
                System.out.println("김규민 학생의 학번: " + student.getId());
                break;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(SearchName)) {
                System.out.println("김규민 학생의 학번: " + student.getId());
                break;
            }
        }

        //20220002 학번의 학생을 지우고 학생 리스트 출력
        int SearchId = 20220002;

        for (Student student : students) {
            if (student.getId() == SearchId) { // 여기까지 이해함
                students.remove(students.indexOf(student));
                break;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == SearchId) {
                students.remove(i);
                break;
            }

        }

        System.out.println(students);

        /*
        id = 20220003학생을 찾아서 그 학생의 이름이 김규민이면 이름을 김경민으로 바꿔라 아니면 바꾸는것 아님.
        */

        int searchId = 20220003;

        for (Student student : students) {
            if (student.getId() == searchId && student.getName().equals("김규민")) {
                student.setName("김경민");  //으름 변경 setName
                break;
            }
        }
        System.out.println(students);
        System.out.println();

        searchId = 20220004;
        /*
        박경효를 박창우로 변경
         */
        Iterator<Student> integer = students.iterator();

        while (integer.hasNext()) {
            Student student = integer.next(); // 알아보기
            if (student.getId() == searchId) {
                student.setName("박창호");
                break;

            }
        }
        System.out.println(students);
        System.out.println();

        List<Student> reverseStudents = new ArrayList<Student>();

//        for(int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size() -1 - i)) ;
//        }

        for(Student student : students) {
            reverseStudents.add(0, student); // 알아보기
        }

        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents); //Collections을 이용해서 순서 뒤집기
        System.out.println(reverseStudents);

        /*
        idList
        nameList
        */

        System.out.println();

        List<Integer> idList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        for(Student student : students) {
            idList.add(student.getId());
        }
        for(Student student : students) {
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear();

        System.out.println(students);


        for(int i = 0; i < idList.size(); i++) {
            students.add(new Student (idList.get(i), nameList.get(i)));
//            students.add(idList.get(i), nameList.get(i));
        }
        System.out.println(students);

    }
}

