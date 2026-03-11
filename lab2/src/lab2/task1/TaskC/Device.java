package lab2.task1.TaskC;

import java.util.Objects;

public abstract class Device {
    private String serialNumber;
    private String brand;

    public Device(String serialNumber , String brand) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Brand : " + getBrand() + "Serial Number : " + getSerialNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        return Objects.equals(serialNumber , device.serialNumber) && Objects.equals(brand, device.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber , brand);
    }


}
