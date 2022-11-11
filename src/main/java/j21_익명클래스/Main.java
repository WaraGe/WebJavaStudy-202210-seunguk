package j21_익명클래스;

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

//      임시로 구현 (1회용)
//      익명클래스를 사용하는 목적은 여러번 사용하면 class로 빼고, 한번 사용할때 사용(class를 만들지 않을때)
        Interface1 interface6 = new Interface1() {

            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");

            }
        };
        System.out.println();
        interface6.methodName();
        interface6.methodName();
        interface6.methodName();


    }
}
