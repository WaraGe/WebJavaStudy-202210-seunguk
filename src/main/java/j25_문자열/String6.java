package j25_문자열;

public class String6 {
    public static void main(String[] args) {
        String httpRequest = "";

    /*
        문자열이 비어있지 않으면?
        1. null이 아니여야 함 = 비어있는 주소값
        2. "" 빈값이 아니어야 함 = 문자가 빈것
        3. " " 스페이스로 띄운 값이 들어가야하는값이 아니어야 함
    */
//        if(!httpRequest.replaceAll(" ", "").equals("") && httpRequest != null) {
//            System.out.println(httpRequest);
//        }else {
//            System.out.println("공백은 사용할 수 없습니다");
//        }
//    }
//      isempty(httpRequest) 는 띄워쓰기는 공백으로 보지않고 ""만 공백으로 본다
        if(!httpRequest.isBlank()) {
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다");
        }
    }
}
