package j11_배열;

import java.util.Scanner;

public class arrayTest2 {
    public static void main(String[] args) {
        /*
        1. 10명의 학생의 이름을 담을 수 있는 studentNames 배열을 만듬
        [출력결과]
        1.정빈
        2.김규민
        3.박경호
        4.김혜진
        5.김지향
        6.전병욱
        7.윤도영
        8.이성욱
        9.홍성욱
        10.박민화
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 학생의 수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] studentNames = new String[count];


        for(int i=0; i < studentNames.length; i++) {
            System.out.print((i+1) + "번 학생이름: ");
            studentNames[i] = sc.nextLine();
        }





       /* studentNames[0] = "정빈";
        studentNames[1] = "김규민";
        studentNames[2] = "박경호";
        studentNames[3] = "김혜진";
        studentNames[4] = "김지향";
        studentNames[5] = "전병욱";
        studentNames[6] = "윤도영";
        studentNames[7] = "이성욱";
        studentNames[8] = "홍성욱";
        studentNames[9] = "박민화";*/

        System.out.println();
        System.out.println("[출력 결과]");
        for(int i = 0; i < studentNames.length; i++) {
            System.out.println((i+1)+". "+studentNames[i]);
        }

    }
}
