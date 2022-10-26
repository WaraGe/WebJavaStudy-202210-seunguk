package j09_클래스;

public class ClassA {
    int num;
    String name;
    double score;

    //생성자
    //생성자는 클래스명이랑 동일해야함
    //생성자는 주소값이 항상 반환이 됨
    //생성자 호출이 출력이 제일 먼저 진행
    //생성자 오버로딩이 된 생성자가 하나라도 있으면, 기본 생성자는 사용할 수 없음
    //생성자 오버로딩, 기본생성자를 사용하고 싶으면, 기본생성자를 만들어 사용하면 됨
    ClassA(int a) {
        System.out.println("a: " + a);
        System.out.println("classA를 생성합니다");
    }


    //void 는 반환이 불가능함 (return값이 없기때문)
    void callName() {
        System.out.println(name + "을 부릅니다");
    }

    void callname2() {
        System.out.println(name + "을 부릅니다2");
    }

}
