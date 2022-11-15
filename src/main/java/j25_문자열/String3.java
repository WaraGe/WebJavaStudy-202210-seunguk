package j25_문자열;

public class String3 {
    public static void main(String[] args) {
        String phoneNumber = "010 9988-1916";

        //문자열이기때문에 계속해서 .붙여서 가능
        String replacePhoneNumber =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/","")
                        .replaceAll("_", "")
                        .replaceAll(" ", "");

        System.out.println(replacePhoneNumber);
    }
}
