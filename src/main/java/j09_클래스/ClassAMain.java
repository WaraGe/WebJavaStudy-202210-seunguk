package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {

        System.out.println(new ClassA(1));
        System.out.println(new ClassA(2));
        System.out.println(new ClassA(3));
        System.out.println(new ClassA(4));

        ClassA a1 = new ClassA(1);
//      자료형 변수명 = 새로운 주소?
        a1.name = "이성욱";
        System.out.println(a1.name);

        ClassA a2 = new ClassA(2);
        a2.name = "2성욱";
        System.out.println(a2.name);

        a1.callName();
        a2.callName();



    }
}
