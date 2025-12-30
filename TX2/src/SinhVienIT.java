public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiem() {
        return (diemJava + diemCss + diemHtml) / 3;
    }
}
