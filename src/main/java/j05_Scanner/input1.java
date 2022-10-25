package j05_Scanner;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "이성욱";


        System.out.print("입력할 값1을 입력하세요: ");
        String s = scanner.nextLine();
        System.out.print("입력할 값2을 입력하세요: ");
        String s2 = scanner.nextLine();
        System.out.print("입력할 값3을 입력하세요: ");
        String s3 = scanner.nextLine();

        System.out.println("입력받은 값1: " + s);
        System.out.println("입력받은 값2: " + s2);
        System.out.println("입력받은 값2: " + s3);


    }
}
