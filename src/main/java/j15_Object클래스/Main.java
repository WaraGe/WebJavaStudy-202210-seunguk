package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        int hashCode = objectTest.hashCode();

        System.out.println((char)hashCode);
//                         toHexString = 16진수로 바꿔라
        System.out.println(Integer.toHexString(hashCode));
        System.out.println(objectTest);
//      hashCode는 주소값을 나타냄
    }
}
