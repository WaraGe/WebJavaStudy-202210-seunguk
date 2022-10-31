package j12_상속;

public class Main {
    public static void main(String[] args) {
//      부모 클래스에 생성자를 만들면 상속받은 클래스에서도 부모가 먼저 생성이 되고 자식의 내용을 출력
//      부모 클래스 에서 super();이 나옴
//        Animal animal = new Animal();
        Human human = new Human("ddddd");
        Tiger tiger = new Tiger("dddd");

//        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: " + human.getName());
        System.out.println("Tiger의 이름: "  + tiger.getName());


    }
}

