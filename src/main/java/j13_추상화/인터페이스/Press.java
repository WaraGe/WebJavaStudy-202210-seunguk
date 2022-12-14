package j13_추상화.인터페이스;

/*
Interface(인터페이스)
1. 기본적으로 모든 메소드가 추상메소드로 정의된다
2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야 한다.
3. 생성자 정의는 불가능하다.
4. 일반 변수 선언이 불가능하다
5. 상수는 선언할 수 있다.
 */

public interface Press {
    public final String NAME = "button";      // [상수 선언, 초기화]
    
    public void onPressed(); // = 추상메서드 abstract 가 생략된다

//   private String name;                      [변수선언]

    /*public Switch() {                       [생성자]

    }*/

   /* public default void pop() {            [일반메서드]
     일반 메서드 선언가능 default를 넣어준다
    }*/
    
}
