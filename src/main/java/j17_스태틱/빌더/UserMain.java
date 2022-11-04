package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder() // builder은 static 매소드
                .email("skjil123123123@naver.com")
                .username("ddd")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .email("zpfhfh774@naver.com")
                .username("ddddd")
                .password("password")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);
    }
}
