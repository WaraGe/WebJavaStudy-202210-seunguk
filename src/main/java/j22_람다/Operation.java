package j22_람다;


@FunctionalInterface // 달아두는이유 : 추상메소드 2개를 만들수없게 하기 위하여
public interface Operation {
    public int clac(int x , int y);

//  2개는 지정할수 없다. 하지만 default메소드는 가능하다.
    public default String resultToString(int result){
        return "결과: " + result;
    }
}
