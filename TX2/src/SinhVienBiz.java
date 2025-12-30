public class SinhVienBiz extends SinhVien {
    private double diemMarketing;
    private double diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    public double getDiem() {
        return (diemMarketing + diemSale) / 2;
    }
}
