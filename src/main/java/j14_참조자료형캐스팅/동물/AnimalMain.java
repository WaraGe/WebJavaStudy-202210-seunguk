package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;


        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        System.out.println("===========");
        tiger.move();
        tiger.hunting();
        System.out.println("===========");

        System.out.println(" [캐스팅]");
        System.out.println("<업캐스팅>");
        animal1 = human;
        animal2 = tiger;
        // readBooks이 없는이유 animal이 readBooks이 없기때문 자식이가지고잇는 변수사용 불가능
        animal1.move(); // == human.move();
        animal2.move(); // == tiger.move();
        System.out.println("<다운캐스팅>");
        // 추상클래스라서 Animal을 생성할수 없다.
        Human d_human = (Human) animal1;
        d_human.readBooks();
        d_human.move();
        Tiger d_tiger = (Tiger) animal2;
        d_tiger.hunting();
        d_tiger.move();

        System.out.println("-----------------------------");
        System.out.println();


//        Animal a = new Animal();
//        Human h = (Human) a;
//        h.readBooks();
    }
}
