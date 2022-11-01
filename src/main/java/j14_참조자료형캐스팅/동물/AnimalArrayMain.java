package j14_참조자료형캐스팅.동물;

// 업캐스팅 하는이유 반복을 하기위해서
// 다운캐스팅을 사용하지 않는 이유 반복을 사용할수 없어서 하지만 가능하게 가능

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i=0; i<animals.length; i++) {
            animals[i].move();
        }
        System.out.println("=================================");
        for(int i =0; i<animals.length; i++) {
            if(animals[i] instanceof Human) {
//             animals[i]로 나오는게 Human으로 생성된 것인가
            /*    Human h = (Human)animals[i];
                h.readBooks();*/
                ((Human) animals[i]).readBooks();
//                                  .이 animals[i]의 값을 먼저 받아서 괄호 필수
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}
