package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}


public class JSON2 {
    public static void main(String[] args) {
        // Gson으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object,

        Gson gsonBilder = new GsonBuilder().setPrettyPrinting().create(); // GsonBuilder뒤에 .을찍으면 기능을 사용할 수 있음
        Gson gson = new Gson();

        String userJson = null;
        String studentsJson = null;
        String productJson = null;


        /*0000000000000000000000000000000000000000000000000000000000000000000000000000*/
        // Object(객체) => JSON
        User user = new User("seunguk", "1234", "zpfhfh774@naver.com", "이성욱");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBilder.toJson(user));
        userJson = gsonBilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");
        System.out.println(gsonBilder.toJson(jsonObject));
        studentsJson = gsonBilder.toJson(jsonObject);

        // Map => JSON
        Map<String, Object> map = new HashMap<>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성노트북");
        System.out.println(gsonBilder.toJson(map));
        productJson = gsonBilder.toJson(map);

        System.out.println("-------user--------");
        User users = convertJsonToUser(userJson);
        System.out.println(userJson);
//        User users = convertJsonToUser(studentsJson);
        System.out.println(users);
        System.out.println("-------------------");

        System.out.println("-----JsonObject-----");
        JsonObject User = convertJsonToJsonObject(userJson);
        System.out.println(users);
        System.out.println("----------");

        // gson => map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);
//        System.out.println(jsonData.get("name"));
        jsonData = convertJsonToMap(studentsJson);
        System.out.println(jsonData);
        jsonData = convertJsonToMap(productJson);
        System.out.println(productJson);
    }
    public static Map convertJsonToMap(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
//                         json -> map으로 바꿔줌
    }
    public static JsonObject convertJsonToJsonObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }
    public static User convertJsonToUser(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}
