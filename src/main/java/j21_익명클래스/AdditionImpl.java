package j21_익명클래스;

import java.util.Collection;

// interface를 생성하려면 implements를 해야한다. 재정의를 위하여
public class AdditionImpl <T> implements Addition<T> {

    @Override
    public T add(T values) {
        System.out.println(values + "데이터들을 합칩니다");
//        Collection<T> collection = (Collection<T>) values;
        return values;
    }
}
