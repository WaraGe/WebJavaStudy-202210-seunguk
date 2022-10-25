package j06_조건;

public class Condition1 {
    public static void main(String[] args) {
        int num = 10;

        if( num > 0 || num ==0 ){
            System.out.println("num:"+ num + "은 양수입니다.");
        }else {
            System.out.println("num:"+ num + "은 음수입니다.");
        }

    }
}
