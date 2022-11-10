package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class ProductImg {
    private int imgCode;
    private String imgName;
}

public class ProductMap {
    public static void main(String[] args) {
        Map<String, Object> product = new HashMap<>();
        product.put("productCode", 1);
        product.put("productName", "스타벅스 블랙 텀블러");
        product.put("productColor", "Black");
        product.put("productSize", "Venti");
        product.put("productImg", null);
        Set<ProductImg> productImgSet = new HashSet<>();
        List<ProductImg> productImg = new ArrayList<>();
        productImg.addAll(productImgSet);

        productImg.add(new ProductImg(1, "starbucks_black_tumbler1.png"));
        productImg.add(new ProductImg(2, "starbucks_black_tumbler2.png"));
        productImg.add(new ProductImg(3, "starbucks_black_tumbler3.png"));
        productImg.add(new ProductImg(4, "starbucks_black_tumbler4.png"));

        product.put("productImg", productImg);
//        System.out.println(product);
//        System.out.println(productImg);
        /*
        텀블러이미지1 : starbucks_black_tumbler1.png
        텀블러이미지2 : starbucks_black_tumbler2.png
        텀블러이미지3 : starbucks_black_tumbler3.png
        텀블러이미지4 : starbucks_black_tumbler4.png
        */

        // 선생님 풀이
//        List<ProductImg> productImgList = (List<ProductImg>) product.get("product");
//        for(ProductImg img : productImgList) {
//            System.out.println("텀블러이미지" + img.getImgCode() + ":" + img.getImgName());
//        }

        for(int i = 0; i < productImg.size(); i++) {
            System.out.println("텀블러이미지"+ ((int)i+1) + " >> " + productImg.get(i).getImgName());
        }
    }
}
