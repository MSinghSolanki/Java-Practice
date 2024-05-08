package Practice;

interface Camera {
    void takeSnap();

    void record();
}

interface Wifi {
    String[] getNetworks();

    void connectNetwork(String network);

}

class MyCellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall() {
        System.out.println("Picking call from");
    }

}

class MySmartPhone extends MyCellPhone implements Wifi, Camera {

    public void takeSnap() {

        System.out.println("Taking Snap");
    }

    public void record() {

        System.out.println("Recording....");
    }

    public String[] getNetworks() {

        System.out.println("Getting list of Networks....");
        String[] networkList = { "Airtel", "jio", "Vodafone" };
        return networkList;

    }

    public void connectNetwork(String network) {

        System.out.println("Connecting...." + network);
    }

}

public class moreinter {

    public static void main(String[] args) {

        MySmartPhone sm = new MySmartPhone();
        sm.takeSnap();
        String[] ar = sm.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

    }

}
