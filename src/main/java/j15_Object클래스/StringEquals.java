package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {

        Object a = "ㅁㅁㅁ";
        System.out.println(a);

        String name1 = "이성욱";
        String name2 = "2성욱";
        String name3 = new String("이성욱");
        String name4 = new String("이성욱");

        
//      생성한게 아님(new String(name(n)) char의 값을 넣어서 합친 진수의 값이라 값비교에 해당 (리터럴 상수 참조)
        System.out.println(name1 == name2);

//      주소가 달라서 값이 false로 나옴, 값 비교가 아님
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

//      문자열의 값을  비교해주는 equals를 사용 (주소비교가 아님)
        System.out.println(name1.equals(name3));

    }
}
