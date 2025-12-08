package b1;

public class Mobile extends Product{
    private String ram;
    private String gpu;
    private int port;
    public Mobile() {}

    public Mobile(int id, String name, int size, double price, int quanlity, String ram, String gpu, int port) {
        super(id, name, size, price, quanlity);
        this.ram = ram;
        this.gpu = gpu;
        this.port = port;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public double getTotalPrice() {
        if (ram.equalsIgnoreCase("4G") && getSize() < 5) {
            return getPrice() * 1.0;
        } else if (ram.equalsIgnoreCase("4G") && getSize() >= 5) {
            return getPrice() * 1.3;
        } else if (ram.equalsIgnoreCase("8G") && getSize() < 5) {
            return getPrice() * 1.2;
        } else {
            return getPrice() * 1.5;
        }
    }

}
