package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StringList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1, "문자열5"); // 1번위치에 문자를 넣으면 리스트가 밀려남.
        printCollection(list);


        ArrayList<String> addAllList = new ArrayList<String>(); // 기존에 있던 리스트를 그대로 옮기는 방법
        addAllList.addAll(list);
        addAllList.addAll(2, list); // Collection을 상속받았기 때문에 가능하다 (set도 가능함)
        printCollection(addAllList);

        //값 조회
        String str1 = list.get(4);
        System.out.println(str1);

        //반복을 사용한 값 조회
        for (int i = 0; i < list.size(); i++) {
            System.out.println("str" + i + ": " + list.get(i));
        }

        int i = 0;
        for (String str : list) { // 배열, set,
            System.out.println("str" + i + ": " + str);
            ++i;
        }

        Iterator<String> iterator = list.iterator(); //
        System.out.println("iterator 첫생성시: " + iterator.next()); // 값을 꺼냈으므로 밑에 값이 5개의 값중 4개만 출력이 됨

        while (iterator.hasNext()) { // .hasNext = 다음이 있나?
            System.out.println("iterator: " + iterator.next()); // .next = 값을 꺼낸다.
        }
//        System.out.println("iterator 첫생성시: "+iterator.next()); // 값을 다 꺼냈으므로 next가 없어서 오류 충돌

        //값 수정
        list.set(1, "문자열6"); // 1번째 문자열의 값을 문자열6으로 바꾸기
        printCollection(list);

        //값 삭제
        list.remove(0);  //list에서는 object를 사용해서 삭제를 하지 않음(공통된 값이 있을수도 있기 때문)
        printCollection(list); // 배열5칸을 4칸으로 수정하고 마지막값을 null값을 주지않고 4칸짜리 배열로 만드는 작업 remove

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).equals("문자열3")) {
                list.remove(j);
                break; // 문자열3이 나란히 있을경우 지워진 자리에 밀려서 그자리로 가기때문에  오류가 나서 break를 선언함
            }
        }

        //값의 위치 찾기
        System.out.println("--문자열2를 추가하고 위치 찾기--");
        System.out.println();
        list.add("문자열2");
        printCollection(list);

        int index = list.indexOf("문자열2"); //문자열2가 어러게 있다면 첫번째 값을 가져옴
        System.out.println("문자열2의 위치: " + index);

        //값을 뒤에서부터 찾고 싶을때

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치: " + lastIndex);

        System.out.println();
        //값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열5");
        System.out.println("list에 문자열5가 포함되어 있는가? " + isTrue);

        System.out.println();
        //리스트를 배열로 변환
        Object[] objects = list.toArray();
        System.out.println(objects[0]);

        printCollection(list);
        for (Object object : objects) {
            System.out.println(object);
        }

        ArrayList<String> list2 = new ArrayList<String>();

        Collections.reverse(list2);



    }

    public static void printCollection(Collection collection) {
        System.out.println(collection);
        System.out.println();
    }
}
