package j16_Bean;

import lombok.*;

import java.util.Objects;

/*
Entity Class = 정보를 담는 클래스
*/
/*
    Entity Class 순서

    멤버변수 선언
    생성자 정의
    Getters And Setters 정의
    Equals And HashCode 정의
    ToString 정의
*/
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;
}
