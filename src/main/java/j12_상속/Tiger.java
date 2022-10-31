package j12_상속;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    /*
    ↓↓↓ 메소드 오버라이딩(오버라이드) ↓↓↓
           오버라이드 단축키 ctrl + O
     */

    @Override
    public void move() {
        super.move();
    }
}

