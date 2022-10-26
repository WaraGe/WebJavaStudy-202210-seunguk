package j09_클래스;

public class Constructor {

    int num;
    String name;

    Constructor() {
        System.out.println("noArgsConstructor(기본생성자)");
    }
    Constructor(int num) {
        System.out.println("RequiredArgConstructor(int 매개변수를 필수로하는 생성자)");
//  지역변수보다 전역변수가 우선순위가 높음
        this.num = num;
    }
    Constructor(String name) {
        System.out.println("RequiredArgConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }
    Constructor(String name, int num) {
        System.out.println("AllArgConstructorConstruct(전체 생성자)");
        this.num = num;
        this.name = name;
    }
    Constructor(int num, String name){
        System.out.println("AllArgConstructorConstruct(전체 생성자)");
        this.num = num;
        this.name = name;
    }
    void showInfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
}
