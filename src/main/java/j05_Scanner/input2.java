package j05_Scanner;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("y값을 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("x + y = " + x + y);

    }
}
