package j04_연산자;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCount = 102;
        int maxPage = totalCount / 10 == 0 ? totalCount / 10 : totalCount / 10 + 1;

        System.out.print("첫번째 페이지를 입력하세요: ");
        int page = sc.nextInt();
        int startIndex = page % 5 == 0 ? page - 4 : page - (page % 5) + 1 ;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage;

        System.out.println("page: " + page);
        System.out.println("startIndex: " + startIndex);
        System.out.println("endIndex: " + endIndex);

        String isMaxIndexStr = page == endIndex ? "마지막 인덱스입니다" : "마지막 인덱스가 아닙니다";
        System.out.println(isMaxIndexStr);
    }
}

