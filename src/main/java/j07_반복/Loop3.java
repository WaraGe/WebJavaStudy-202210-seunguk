package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("몇번 반복할지 입력하세요: ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++) {
            System.out.println(i+1);
        }

        for(int i = 0 ; i < n; i++) {
            System.out.println(n-i);
        }


    }
}
