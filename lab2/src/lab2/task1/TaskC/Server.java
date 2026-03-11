package lab2.task1.TaskC;

import java.util.Objects;

public class Server extends Device{
    private String ipAddress;


    public Server(String serialNumber , String brand , String ip) {
        super(serialNumber, brand);
        this.ipAddress = ip;
    }

    public String getIpAddress() {
        return ipAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Server server = (Server) o;
        return Objects.equals(ipAddress, server.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode() , ipAddress);
    }




}
