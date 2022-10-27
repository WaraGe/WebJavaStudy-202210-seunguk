package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20202020, "이성욱");

        sam.showInfo();
        sam.setName("2성욱");
        sam.showInfo();

        System.out.println(sam.getName());

    }
}
