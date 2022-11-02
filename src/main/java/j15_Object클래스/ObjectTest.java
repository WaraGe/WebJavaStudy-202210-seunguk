package j15_Object클래스;

/*
* 모든 클래스는 Object 클래스를 상속받는다
* External Libraries > jdk > java.base > java > lang > 안에 클래스를 찾아 볼수 있다 (Ctrl + 클릭, Ctrl + B) 도 가능 import를 사용하지 않음
* 뒤에 ~s붙는건 기능을 모아놓은 클래스 (컬랙션)
*/

public class ObjectTest extends Object {
    Object object = new Object();

    private String name;
    private String address;

    public ObjectTest() {}

    public ObjectTest(String name, String address){
        this.name = name;
        this.address =  address;
    }
    public String ShowInfo() {
//                System.out.println("name: " + name);
//                System.out.println("address: " + address);
        return "name: " + name + ", address: " + address;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address;
    }
}
