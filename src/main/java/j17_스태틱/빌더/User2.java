package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
/*
자동으로 null, 0 값을 지정해준다
*/
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    public User to() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
