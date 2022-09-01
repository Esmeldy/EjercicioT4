package Gadget;

import Device.SmartDevice;

public class SmartWatch extends SmartDevice {
    private String watchBand;
    private String deviceName;
    private String color;


    public SmartWatch(String brandName, String modelName, String processor, String memory, String display, String systemName, String watchBand) {
        super(brandName, modelName, processor, memory, display, systemName);
        this.watchBand = watchBand;
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
        txt = "Nombre del dispositivo: "+deviceName+"\nMarca: "+getBrandName()+"Modelo: "+getModelName()+"\nProcesador: "+getProcessor()+"\nMemoria: "+getMemory()+"" +
                "\nPantalla: "+getDisplay()+"\nSistema Operativo: "+getSystemName()+"Color de la correa: "+watchBand+"Color: "+color;
        return txt;
    }
}
