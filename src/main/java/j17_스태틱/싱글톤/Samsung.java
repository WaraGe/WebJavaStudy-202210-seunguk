package j17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung {
    
    @Getter //이런식으로 적으면 company만 getter만 생김
    private String company;
    private int serialNumber;


    private static Samsung instance = null;

    //1회용
    private Samsung() {
        company = getClass().getSimpleName(); // 클래스명
        serialNumber = 20220000;
    }


//    static 없이 사용하면 다른곳에서 생성할 수 없기때문에 static으로 선언이 간으함
//    public static Samsung getSamsung() {
//        return new instance();
//    }

//    값 변화가 계속 일어남.
    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }



}
