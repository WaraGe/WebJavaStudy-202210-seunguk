package j07_반복;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int i = 0;
        System.out.print("~까지 더할 값을 입력하세요: ");
        int lastCount = sc.nextInt();
        System.out.print("시작값을 입력하세요: ");
        for(i = sc.nextInt(); i < lastCount; i++) {
            total += i;
        }
        System.out.println("0 부터 "+i+" 까지 더한 값은 "+total);
    }
}
