package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("이성욱","코리아 아이티");
        Teacher teacher2 = new Teacher("이성욱","코리아 아이티");

        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

//      Field 클래스를 가져왔을때 변수의 명까지 전부 가져옴 (getName())
        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i <fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }

        // 클래스 안에 클래스
        t_class.getDeclaredClasses();

        Method[] methods = t_class.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getReturnType().getSimpleName());
        }

        //같은 객체인지 비교 instanceof를 생략이 가능
        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class); // 이 방식으로 사용
        System.out.println(teacher2.getClass() == Teacher.class); // 이 방식으로 사용




    }
}
