package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {

    private Power[] deviceArray;


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
//  alt + insert = constructor
//    public CentralControl(Power computerPower, Power ledPower, Power speakerPower) {
//        this.computerPower = computerPower;
//        this.ledPower = ledPower;
//        this.speakerPower = speakerPower;
//    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return; //if문을 통과했을시 밑에 구문을 실행하면 안되니,  return을 걸어줌
        }
        deviceArray[emptyIndex] = device; //반복문을 통과했을때, 실행될 동작
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다");
        System.out.println();
    }
//    빈공간 찾기
    public int checkEmpty() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
//       빈공간이 없으면 리턴
        return -1;
    }

    public void powerOn() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) { //추가
                continue;
            }
            deviceArray[i].on();
        }
    }

    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) { //추가
                continue;
            }
            deviceArray[i].off();
        }
    }
}
