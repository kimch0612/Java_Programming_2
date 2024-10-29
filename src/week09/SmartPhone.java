package week09;

public class SmartPhone {
    private Battery battery;
    public void runSmartPhone() {
        battery.startConsume();
    }
    class Battery {
        void startConsume() {
            System.out.println("배터리 소모 시작");
        }
    }
    
    public static void main(String[] args) {
        SmartPhone myBattery = new SmartPhone();
        myBattery.runSmartPhone();
    }
}
