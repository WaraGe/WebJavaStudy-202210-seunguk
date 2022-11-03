package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;

@Getter
@Setter
public class ProductMain {
    private String name;


    public static void main(String[] args) {
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++; // < 20220001이 되고 Product.java 파일에서 ++이 되서 20220002가 되서 , p1을 밑에 생성자를 통해서 출력한 값에 출력이 된다.
        System.out.println(Product.autoIncrement);

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        System.out.println(p1.getAutoIncrement());
        System.out.println(p1.getAutoIncrement());
        System.out.println(p1.getAutoIncrement());
        System.out.println(p1.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        System.out.println("----------------------------------");
        
//      클래스, 인터페이스 상관없이 static이면 어디서든지 사용할수 있지만 대부분 인터페이스에서 정의를 해놓고 사용함.
        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        System.out.println("----------------------------------");

        Product.printInfo();

        System.out.println("----------------------------------");
//        ProductMain.main(new String[] {}); // main에서 main을 호출

        ProductMain productMain = new ProductMain();
        
        productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[] {});
        Method1.call1();

    }
}
