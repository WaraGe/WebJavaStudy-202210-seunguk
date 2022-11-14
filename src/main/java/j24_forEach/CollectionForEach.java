package j24_forEach;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("이성욱");
        list.add("김준일");
        list.add("김경민");
        list.add("이동빈");
        list.add("이동준");

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println();

        list.forEach(name -> {
            System.out.println(name);
        });

        System.out.println();

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        }; // 이렇게 작성하는게 너무 길고 번거로우니 람다로 수정

        // 아래 로직을 한번에 적은게 바로 위에있는 구문이다
        Consumer<String> consumer = name -> { //없거나 두개이상일시 괄호 필수
            System.out.println(name);
        }; // ;로 마무리 하는 이유는 객체가 생성됬으니 문장 마무리


//        Objects.requireNonNull(list);
        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }
        /////////////////////////////////////////////////////

        System.out.println();

        list.forEach(name -> consumer.accept(name));

        System.out.println();

        Set<Integer> numbers = new HashSet<>();
        for(int i =0; i < 100; i++) {
            numbers.add(i + 1);
        }

        AtomicInteger result = new AtomicInteger();// AtomicInteger람다때 사용

        numbers.forEach(num -> {
            result.addAndGet(num); // addAndGet(num) = result의 값을 가져와서 뒤에 값을 더하라는 것 (+= 와 동일)
        });

        System.out.println(result.get());

        System.out.println();

        Map<Integer, String> students = new HashMap<>(); // TreeMap을 사용하면 정렬이 된다.

        for(int i = 0 ; i < 10; i++) {
            students.put(20220001 + i, "김준" + (i + 1));
        }

        students.forEach((key, value) -> {
            System.out.println("학번: " + key + ", 이름: " + value);
        });




    }
}
