abstract public class SinhVien {
    private String hoTen;
    private String nganh;

    public SinhVien () {}
    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    abstract public double getDiem();
    public String getHocLuc() {
        if (getDiem() >= 9)
            return "XS";
        else if (getDiem() >= 7.5 && getDiem() < 9)
            return "Gioi";
        else if (getDiem() >= 6.5 && getDiem() < 7.5)
            return "Kha";
        else if (getDiem() >=5 && getDiem() < 6.5)
            return "TB";
        else
            return "Kem";
    }
    @Override
    public String toString() {
        return String.format("SinhVien{HoTen = '%s', Nganh = '%s', DiemTB = '%.2f', HocLuc = '%s'", hoTen, nganh, getDiem(), getHocLuc());
    }
}
