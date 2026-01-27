// Parent class
class SmartDevice {
    void powerOn() {
        System.out.println("Device is now ON");
    }

    void powerOff() {
        System.out.println("Device is now OFF");
    }
}

// Child class 1
class SmartPhone extends SmartDevice {
    void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }
}

// Child class 2
class SmartWatch extends SmartDevice {
    void trackSteps(int steps) {
        System.out.println("Steps today: " + steps);
    }
}

// Child class 3
class SmartTV extends SmartDevice {
    void streamVideo(String app) {
        System.out.println("Streaming from " + app);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn();
        phone.makeCall("9876543210");
        phone.powerOff();

        System.out.println();

        SmartWatch watch = new SmartWatch();
        watch.powerOn();
        watch.trackSteps(4321);
        watch.powerOff();

        System.out.println();

        SmartTV tv = new SmartTV();
        tv.powerOn();
        tv.streamVideo("YouTube");
        tv.powerOff();
    }
}


//Device is now ON
//Calling 9876543210...
//Device is now OFF
//
//Device is now ON
//Steps today: 4321
//Device is now OFF
//
//Device is now ON
//Streaming from YouTube
//Device is now OFF
