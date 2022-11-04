package j17_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private  String password;
    private String email;
    private String name;

    public static class UserBuilder { //User클래스 내에서만 사용가능
        private String username;
        private  String password;
        private String email;
        private String name;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }
        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder() { // 위의 객체를 만들때 사용
        return new UserBuilder();
    }
}
