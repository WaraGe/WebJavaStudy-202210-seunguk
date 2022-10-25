package j06_조건;

import java.util.Scanner;

public class vnfdl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0 ;
        String grade = null ;

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();

        if(score < 0 || score > 100) {
            grade = "X";
        }else if(score > 89 ) {
            grade = "A";
        }else if(score > 79) {
            grade = "B";
        }else if(score > 69) {
            grade = "C";
        }else if(score > 59) {
            grade = "D";
        }else {
            grade = "F";
        }
        System.out.println("입력하신 점수는 "+score+"점이며, 학점은 "+grade+"학점 입니다");
    }
}
