package j13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory = new TabletFactory("애플 태블릿 공장");

        phoneFactory.produce("아이폰14");
        tabletFactory.produce("아이패드 mini6");

        tabletFactory.printInfo();
        phoneFactory.printInfo();


//        Factory factory = new Factory();
    }
}
