package j22_람다;

public class OperationMain {
    public static void main(String[] args) {
        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int clac(int x, int y) {
                return x + y;
            }
        };
      // public int clac 부분이 -> 로 되고 return 값이 뒤로 붙는다
      // 구현할 메소드가
        Operation add2 = ((x, y) -> x + y);

        System.out.println(add2.resultToString(add2.clac(b, a)));
      // Operation add2 = ((x, y) -> x + y);

//      매개변수의 자료형은 생략이 가능하다
//      return도 생략이 가능하다.
//      중괄호도 한줄이면 생략이 가능하다.
        Operation sub = (x, y) -> x - y;

        System.out.println(sub.resultToString(sub.clac(b, a)));

        Operation multi = (x, y) -> x * y;

        System.out.println(multi.resultToString(multi.clac(b, a)));

        Operation div = (x, y) -> x / y;

        System.out.println(div.resultToString(div.clac(b, a)));



        int addResult = add.clac(a, b);
        System.out.println(a + " + " + b + " = " + addResult);

        int addResult2 = add2.clac(a, b);
        System.out.println(a + " + " + b + " = " + addResult2);
    }
}
