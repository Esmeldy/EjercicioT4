package Gadget;

import Device.SmartDevice;

public class Smartphone extends SmartDevice {
    private String deviceName;
    private String color;

    public Smartphone(String brandName, String modelName, String processor, String memory, String display, String systemName, String deviceName, String color) {
        super(brandName, modelName, processor, memory, display, systemName);
        this.color = color;
        this.deviceName = deviceName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String deviceDetails() {
       String txt = "";
       txt = "Nombre del dispositivo: "+deviceName+"\nMarca: "+getBrandName()+"Modelo: "+getModelName()+"\nProcesador: "+getProcessor()+"\nMemoria: "+getMemory()+"" +
               "\nPantalla: "+getDisplay()+"\nSistema Operativo: "+getSystemName()+"Color: "+color;
        return txt;
    }
}
