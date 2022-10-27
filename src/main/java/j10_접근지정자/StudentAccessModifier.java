package j10_접근지정자;

public class StudentAccessModifier {
//  멤버변수는 무조건 private
    private int code;
    private String name;


    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //  메소드는 public
    public void showInfo() {
        System.out.println("학번: " + this.code);
        System.out.println("이름: " + this.name);
    }
}
