package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//  hash의 개념 알아보기 : 자료를 일정한 형식의 식별값으로 나타내기 위한 노력의 산물

public class StringSet {
    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일"); // set의 특징 중복이 안된다 (중복 제거용으로 많이 사용)

        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        //값 조회
        String searchName = "김준2";

        // strSet에 SearchName이 있으면 true, 없으면 false
        boolean isTrue = false;

        for (String name : strSet) {
            if (name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);
        
        String FindName = "김준일";
        // 수정
        // 송아셀 -> 남강석

//        System.out.println(strSet);
//        strSet.add("남강석");
//        System.out.println(strSet);

        for(String name : strSet) {
            if(name.equals("송아셀")) {
                strSet.remove("송아셀");
                strSet.add("남강석");
                break; // break 필수 
            }
        }
        System.out.println(strSet);
        
        boolean a = strSet.contains("김준일");
        System.out.println(a);
        System.out.println(strSet.contains(FindName));
        
        if(strSet.contains(FindName)) {
            strSet.remove(FindName);
            strSet.add("김준이");
        }

        System.out.println(strSet);
        
        
        
    }
}
