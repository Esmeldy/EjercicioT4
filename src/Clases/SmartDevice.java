package Clases;

public abstract class SmartDevice {
    protected String brandName;
    protected String model;
    protected String processor;
    protected String memory;

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
