package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 임시 클래스를 만들어서 생성된 주소를 integerAddition에 담는다
        // 임시 클래스는 생성이 1번밖에 안됨. 재사용도 안됨.
        Addition<Integer> integerAddition = new Addition<Integer>() {

            // 클래스 정의
            @Override
            public Integer add(Integer values) {
                return null;
            }
        };


    }
}
