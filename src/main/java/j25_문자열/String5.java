package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";
        
        if(httpMethod.equalsIgnoreCase("gEt")) {
//            upper, lowercase 말고 equalsignorecase를 사용하면 영 대/소문자를 구분하지않고 받아들인다
            System.out.println("get요청입니다");
        }else {
            System.out.println("get요청이 아닙니다");
        }
    }
}
