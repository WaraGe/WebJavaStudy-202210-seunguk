package j04_연산자;

/**
 *         <논리 연산자>
 *    true(1), false(0)
 *    AND &&
 *    OR  ||
 *    NOT !
 */


public class Operation2 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T X T => " + result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T X F => " + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F X F => " + result3);

        System.out.println();

        boolean result4 = flag1 || flag1;
        System.out.println("T + T => " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F => " + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F => " + result6);

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F X T => " + result7);

        boolean result8 = flag1 || flag2 && flag1;
        System.out.println("T + F X T => " + !result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 => " + result9);

        int year = 2022;
        boolean result10 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result10);




    }
}
