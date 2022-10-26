package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor c1 = new Constructor();
        c1.showInfo();

        Constructor c2 = new Constructor(10);
        c2.showInfo();

        Constructor c3 = new Constructor(10, "이성욱");
        c3.showInfo();

        Constructor c4 = new Constructor("이성욱", 10);
        c4.showInfo();
    }

}
