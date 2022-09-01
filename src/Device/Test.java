package Device;

import Gadget.SmartWatch;
import Gadget.Smartphone;

public class Test {
    public static void main(String[] args) {
        //Dispositivos

        Smartphone device = new Smartphone();
        Smartphone device2 = new Smartphone("Samsung", "Note","Exynos","256 GB" +
                "","Amoled","Android","Galaxy","Gris"
                );

        device.setDeviceName("Iphone");
        device.setBrandName("Apple");
        device.setDisplay("Retina Display");
        device.setMemory("8GB");
        device.setProcessor("M1");
        device.setModelName("12 Pro");
        device.setColor("Gris Espacial");
        device.setSystemName("IOS");

        //Imprimir detalles
        System.out.println("Dispositivo 1: "+device.deviceDetails());
        System.out.println("Dispositivo 2: "+device2.deviceDetails());

        //Smartwatch

        SmartWatch watch1 = new SmartWatch("Apple","Apple Watch","M1" +
                "","1 GB","Retina Display","IOS","Silicona","Series 7","Blanco");

        SmartWatch watch2 = new SmartWatch();
        watch2.setColor("Negro");
        watch2.setWatchBand("Policarbonato");
        watch2.setDeviceName("Watch");
        watch2.setBrandName("Huawei");
        watch2.setSystemName("Harmony OS");
        watch2.setDisplay("Amoled");
        watch2.setMemory("2GB");
        watch2.setProcessor("Qualcom 750");
        watch2.setModelName("GT 3");

        //Imprimir detalles
        System.out.println("Smartwatch 1: "+watch1.deviceDetails());
        System.out.println("Smartwatch 2: "+watch2.deviceDetails());
    }
}
