package Gadget;

import Device.SmartDevice;

public class SmartWatch extends SmartDevice {
    private String watchBand;
    private String deviceName;
    private String color;


    public SmartWatch(String brandName, String modelName, String processor, String memory, String display, String systemName, String watchBand, String deviceName, String color) {
        super(brandName, modelName, processor, memory, display, systemName);
        this.watchBand = watchBand;
        this.deviceName = deviceName;
        this.color = color;
    }

    public SmartWatch() {
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWatchBand() {
        return watchBand;
    }

    public void setWatchBand(String watchBand) {
        this.watchBand = watchBand;
    }

    @Override
    public String deviceDetails() {
        String txt = "";
        txt = "\nNombre del dispositivo: "+deviceName+"\nMarca: "+getBrandName()+"Modelo: "+getModelName()+"\nProcesador: "+getProcessor()+"\nMemoria: "+getMemory()+"" +
                "\nPantalla: "+getDisplay()+"\nSistema Operativo: "+getSystemName()+"" +
                "\nTipo de correa: "+watchBand+"\nColor: "+color+"\n******************************************************";
        return txt;
    }
}
