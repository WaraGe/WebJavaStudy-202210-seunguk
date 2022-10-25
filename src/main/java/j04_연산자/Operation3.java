package j04_연산자;


/*
윤년의 연도가 4의 배수이면서,
100의 배수가 아닐 때 400의 배수일 때이다.
 */

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("윤년 입력: ");
        int year = sc.nextInt();
        boolean result = false;

        result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;


        System.out.println("결과:  " + result);
    }
}
