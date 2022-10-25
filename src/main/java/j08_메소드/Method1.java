package j08_메소드;

/*
메소드란?

 */
public class Method1 {

    // 1.[x | x] 입력(매개변수), 2. 출력(반환)
    public static void call1() {
        System.out.println("[ x : x ]");
    }

    // 2.[o | x]
    public static void call2(String str) {
        System.out.println("[ o : x ]");
        System.out.println("수업과목: " + str);
    }

    // 3. [x | o]
    public static String call3() {
        System.out.println("[ x  : o ]");
        String result = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    //4. [o | o]
    public static String call4(int year, int month, int day) {
        System.out.println("[ o  : o ]");
        return year + "년" + month + "월" + day + "일";
    }


    public static void main(String[] args) {
        call1();
        call2("Java");
        String star = call3();
        System.out.println(star);
        String a = call4(2000, 12, 25);
        System.out.println(a);
    }
}
