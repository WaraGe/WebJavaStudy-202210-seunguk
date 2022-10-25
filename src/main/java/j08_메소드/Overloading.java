package j08_메소드;

public class Overloading {


    /*메소드 오버로딩
    * 메소드의 형태가 다르면 동일한 메소드 명을 가지고 정의할 수 있다.
    * */

    public static void add() {
        System.out.println("add()");
    }

    public static void add(int a) {
        System.out.println("add(int a)");
    }

    public static void add(String a) {
        System.out.println("add(String a)");
    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
    }

    public static void main(String[] args) {

        add();
        add(1);
        add("10");
        add(10,10);

    }

}
