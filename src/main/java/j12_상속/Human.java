package j12_상속;

public class Human extends Animal {

    public Human(String name) {
//      super = 부모의 주소
        super(name); // <-
//      1. 부모 생성자의 호출은 생략되어있음 오버로딩을하면 필수 조건으로 적어야함.
//      2. 부모 생성자가 항상 위에 위치하여 있어야 함
//      3. 부모가 생성되어야지만 부모를 불러 올 수 있음

//        super.move();
        System.out.println("Human 생성");
    }

    public Human() {
        super("dd");
        System.out.println("Human 생성");
    }

     /*
                  ↓↓↓ 메소드 오버라이딩(오버라이드) ↓↓↓
                            의미 : [재정의]
    상위(Aniaml) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
    @Override를 필수로 적어줘야 함(해당 메소드가 상위 객체로 부터 재 정의된 메소드라고 표기하기 위해서) - 특별한 기능X
    @ = (어노테이션)
     */
    @Override
    public void move() {
        super.move(); // 재정의 한 것도 호출하면서 부모의 move()도 같이 실행하는
        // 방법 그냥 move()로 입력을하면 재기함수(자기 자신을 불러오는) 를 불러옴.
        System.out.println("두발로 걷습니다");
    }
}

