package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        /*
            이름: 김준일                name
            나이: 29                    age
            주소 : 부산 동래구 사직동   add
            연락처 : 010 9988 1916      phone
            
            사용자의 이름은 김준일이고 나이는 29세 입니다.
            주소는 부산 동래구 사직동이며 연락처는 000 0000 0000입니다
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("주소를 입력하세요: ");
        sc.nextLine();
        String add = sc.nextLine();
        System.out.print("연락처를 입력하세요: ");
        String phone = sc.nextLine();

        System.out.println();
        System.out.println();

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"세 입니다.");
        System.out.println("주소는 "+add+"이며 연락처는 "+phone+" 입니다");

    }
}
