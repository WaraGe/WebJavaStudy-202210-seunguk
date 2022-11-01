package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(computer, led, speaker); //power가 없지만, 구현된 3개가 들어가짐(묵시적 형변환이 가능하다)
        // CentralControl centralControl = new CentralControl((Power) computer,(Power) led,(Power) spaker); 원래는 이렇게 업캐스팅 되어야 함

        centralControl.powerOn();
        System.out.println("----------------------------------");
        centralControl.powerOff();

    }
}
