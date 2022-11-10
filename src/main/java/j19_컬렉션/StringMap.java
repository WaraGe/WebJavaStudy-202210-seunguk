package j19_컬렉션;

import java.lang.reflect.GenericArrayType;
import java.util.*;
import java.util.stream.Collectors;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

//        map.put("0", "김준일"); //값을 하나만 넣을수 없다.  key, value(값) 을 지정해줘야 한다
//        map.put("1", "이동빈");
//        map.put("2", "도정민");
//        map.put("3", "최해혁");
//        map.put("4", "김준일");

        map.put("kor2022000-j", "김준일"); //원하는 키값을 적을수 있음 int값 뿐만 아니라 문자로도 가능하다
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");

        System.out.println(map);
        System.out.println(map.get("kore2022000-j"));
    
        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라
        */

        String searchid = "kor2022000-c";
        // put을 사용하여 값 변경
        // set이다 보니깐 key값은 중복으로 찾지않고(key값은 고유해야함) value값을 덮어씌우기 때문에 가능
        map.put("kor2022000-c", "김완준");
        System.out.println(map);
        // 값 수정
        // replace = 수정  == list set()과 동일
        map.replace(searchid, "이성욱");
        System.out.println(map);
        // 값 삭제
        map.remove(searchid);
        System.out.println(map);
        
        // 맵 만의 특징

        System.out.println(map.containsKey(searchid)); // 포함하고 있나?(boolean 타입) - key값으로 확인하는 방법

        System.out.println(map.containsValue("김준일")); // 포함하고 있나?(boolean 타입) - value값으로 확인하는 방법

        System.out.println();
//        Set<Map.Entry<String, String>> entry = map.entrySet();
//        entry.iterator().forEachRemaining(e ->{
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        });

        // entry = key, value를 하나로 묶은 객체
        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();

        entries.addAll(entry);

        System.out.println("entry리스트: " + entries);
        System.out.println();

        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        Set<String> keySet = map.keySet();
        System.out.println("keySet >>>> " + keySet);

        Collection<String> values = map.values();
        System.out.println("Value >>>> " + values );
    }
}
