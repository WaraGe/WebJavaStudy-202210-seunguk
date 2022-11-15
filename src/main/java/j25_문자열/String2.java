package j25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-9988-1916";

//        int index = phoneNumber.lastIndexOf("-");
        int LastHyphenIndex = phoneNumber.lastIndexOf("-");
        int FirstHyphenIndex = phoneNumber.indexOf("-");
        System.out.println("index: " + LastHyphenIndex);

        String middelNumber = phoneNumber.substring(FirstHyphenIndex+ 1, LastHyphenIndex);
        String substringLastNumber = phoneNumber.substring(LastHyphenIndex + 1);

        System.out.println(middelNumber);
        System.out.println(substringLastNumber);

    }
}
