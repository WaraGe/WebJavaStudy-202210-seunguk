package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("이성욱","코리아 아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("이성욱","코리아 아이티");

//        System.out.println(teacher1 == teacher2); //주소값이 다르니깐
        System.out.println(teacher1.equals(teacher2)); // equals(teacher2)를 오버로딩 하지 않았기 때문에 주소 비교를 하고있다
                             // 오브젝트를 사용해기 때문에 사용이 가능하다
        System.out.println(teacher1.hashCode() == teacher2.hashCode());
//                          hashcode =  값만 같으면 동일한 코드로 만들어줌
        // 등호사용으로 주소비교, 
        // equals 동일 자료형으로 비교, 
        // hashCode로 객체의 형태는 상관없이 hashCode만들어진 값들의 조합을 비교
    }
}
