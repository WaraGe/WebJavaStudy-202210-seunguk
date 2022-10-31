package j13_추상화.추상클래스;

/*
abstract >> 추상적인, 설계도 라고 말하기도 함
1. 추상 메소드 클래스 안에 하나라도 존재한다면 이 클래스는 추상 클래스로 정의해야한다.
2. 추상 클래스는 생성할 수 없다
3. 그 외의 다른 특징은 일반 클래스와 동일하다.
구현부가 없어서 실행할 수 없음 그러므로 생성하여 사용할 수 없다.
 */
// 정의 :
// 선언부 :
// 구현부 : 실행이 되기위해서

public abstract class Factory {
//  정의는 가능하지만, 호출은 안됨
    private String name;

    public Factory(String name) {
        this.name = name;
    }
    public abstract void produce(String model);
    public abstract void management();

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름: " + name);
    }

}
