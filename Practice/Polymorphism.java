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

class MySmartPhone2 extends MyCellPhone implements Wifi, Camera {

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
    public void sampleMeth(){
        System.out.println("Meth");
    }

}



public class Polymorphism {
    public static void main(String[] args) {
        // Refernece of Camera and object of MySmartPhone2

         Camera cam1 =new MySmartPhone2();
        // cam1.getNetworks(); ---> Not allowed;
        // cam1.sampleMeth(); --> Not allowed;
        cam1.record();
        
        
    }
    
}
