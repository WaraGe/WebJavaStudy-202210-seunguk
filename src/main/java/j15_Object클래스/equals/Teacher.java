package j15_Object클래스.equals;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if(this == obj) return true;
//        if(obj == null) return false;
//        if(getClass() != obj.getClass()) return false; //teacher(n)의 클래스클래스 가 obj의 클래스와 다르면 false값 출력
//
//        Teacher other = (Teacher) obj;
//        return Objects.equals(name, other.name)
//                && Objects.equals(schoolName, other.schoolName);
//                                    //같은 클래스 이기때문에 .name,.schoolName 사용가능
////        return Objects.equals(name, ((Teacher) obj).name);
//                                   // 다운캐스팅을 해서 보여줌
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name)
                && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
//               
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
