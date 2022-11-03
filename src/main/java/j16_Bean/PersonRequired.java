package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor은 사용 할수가 없다 (final이 있기 때문)
@RequiredArgsConstructor // final을 가지고 있는 놈들만
@AllArgsConstructor // 전체(name, age) 생성자
public class PersonRequired {
    private final String name;
    private int age;

}
