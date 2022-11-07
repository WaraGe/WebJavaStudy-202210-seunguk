package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
}
