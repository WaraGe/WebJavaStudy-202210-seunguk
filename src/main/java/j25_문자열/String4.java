package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");
//        스플릿을 이용해서 문자열 배열에 대입하라
//        toarray 확인하기(배열로 변경하는것)

        //배열을 리스트로 노다가 하는방법
//        List<String> roleList = new ArrayList<>();
        
        //Arrays.asList를 사용하면 반복을 돌릴 필요없이 배열을 리스트로 변경한다
        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<>();
        List<String> validRoleList2 = new ArrayList<>();


        roleList.forEach(role -> {
            //빈 리스트에 ROLE이 앞에 있는 문자만 받고싶을때
            //앞에 있는 것을 딸때 : 프리픽스(startsWith), 뒤에 있는 것을 딸때 : 서브픽스
            if(role.startsWith("ROLE")) {
                validRoleList.add(role);
            }
        });

        System.out.println(validRoleList);

        roleList.forEach(role -> {
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")) {
                validRoleList2.add(role);
            }
        });

        System.out.println(validRoleList2);

//        System.out.println(roleList);

    }
}
