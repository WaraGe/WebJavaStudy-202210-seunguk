package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
public class Product {
    public static int autoIncrement = 20220000;

    private int serialNumber = 20220001;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }
    public static void printInfo() {
//        System.out.println(productName);  static변수가 아니라서 static 클래스에 들어갈 수 없다.
//                                          생성이 안되도 사용할려는 class가 생성을 해야 하는 함수를 가지려고 하니 사용할수 없다고 한다
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }
}
