package Device;

public abstract class SmartDevice {
    protected String brandName;
    protected String modelName;
    protected String processor;
    protected String memory;
    protected String display;
    protected String systemName;

    public SmartDevice(String brandName, String modelName, String processor, String memory, String display, String systemName) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.processor = processor;
        this.memory = memory;
        this.display = display;
        this.systemName = systemName;
    }

    public SmartDevice() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public abstract String deviceDetails();

}
