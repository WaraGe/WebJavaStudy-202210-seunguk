package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("이성욱","부산");

        System.out.println(objectTest); // ObjectTest클래스의 tostring을 override를 사용해서 출력하면 값을 가져옴
        System.out.println(objectTest.toString());

//        String str = objectTest;
        String str = objectTest.toString();
        System.out.println(str);

        System.out.println(objectTest.ShowInfo());
        
        Teacher teacher = new Teacher("이성욱","코리아 아이티");
        Teacher teacher2 = new Teacher("2성욱","코리아 아이티");

        System.out.println(teacher.toString());
        System.out.println(teacher2.toString());


    }
}
