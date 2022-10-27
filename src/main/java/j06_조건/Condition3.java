package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        String grade = null;

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();

        /*
        조건
        score 0보다 작거나 100보다 크면 grade는 X
        score가 90점~100점 사이면 A
        score가 80점~89점 사이면 B
        score가 70점~79점 사이면 C
        score가 60점~69점 사이면 D
        score가 0점 ~ 60점 사이면 F

        입력하신 점수는 00점이며, 학점은 0학점 입니다
         */


        if ( score >= 90 && score <= 100){
            grade = "j10_접근지정자/A";
        }else if ( score >= 80 && score <= 89) {
            grade = "B";
        }else if ( score >= 70 && score <= 79) {
            grade = "C";
        }else if ( score >= 60 && score <= 69) {
            grade = "D";
        }else if ( score >= 0 && score <= 60) {
            grade = "F";
        }else
        grade = "X";
        System.out.println("입력하신 점수는 "+score+"점이며, 학점은 "+grade+"학점 입니다");




      
    }
}
