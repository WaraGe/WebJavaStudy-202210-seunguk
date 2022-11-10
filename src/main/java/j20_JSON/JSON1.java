package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
//      기본적으로 Map과 구조가 같다
        // key,value과 같은 값만 들어갈수 있음 메소드값X

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "seunguk");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "zpfhfh774@naver.com");
        jsonObject.addProperty("username", "junil");
        jsonObject.addProperty("age", 26);

        System.out.println(jsonObject);

        //빌더 생성후 오브젝트를 닮을시 예쁘게 출력하는것을 만들기
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
