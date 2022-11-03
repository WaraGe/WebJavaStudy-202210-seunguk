package j16_Bean;

public class Person {
    private final String name;                   // <- 멤버변수에 final을선언하면 필수값이 된다
    private int age;

//    public Person() {                          // <- NoArgsConstructor는 RequiredArgConstructor와 함께 쓸수 없다
//
//    }

    public Person(String name) {                 // <- RequiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) {       // <- AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
