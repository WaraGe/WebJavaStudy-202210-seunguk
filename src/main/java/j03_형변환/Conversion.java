package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
            //업캐스팅
            /*char cast1 = 'a';
            System.out.println(cast1);
            System.out.println("======");
            System.out.println((int) cast1);
            System.out.println("======");
            System.out.println((long)cast1);
            System.out.println("======");*/

            //다운캐스팅
            /*long cast2 = 98;
            System.out.println(cast2);
            System.out.println("======");
            //char cast4 = cast3;
            System.out.println((int) cast2);
            System.out.println("======");
            System.out.println((char) cast2);*/


            double cast = 3.14;
            int cast6 = (int)cast;
            System.out.println(cast6);

            double cast7 = cast;
            System.out.println(cast7);



    }
}
