public class SachGiaoTrinh extends Sach implements IkiemKe {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(){
        super();
    } 

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.capDo=capDo;
        this.monHoc=monHoc;
    }

    @Override
    public String getMaSach() {
        return super.getMaSach();
    }

    @Override
    public int getNamXuatBan() {
        return super.getNamXuatBan();
    }


    @Override
    public int getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    public String getTacGia() {
        return super.getTacGia();
    }

    @Override
    public String getTieuDe() {
        return super.getTieuDe();
    }

    @Override
    public double getGiaCoBan() {
        return super.getGiaCoBan();
    }

    public String getCapDo() {
        return capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    @Override
    public void setMaSach(String maSach) {
        super.setMaSach(maSach);
    }

    @Override
    public void setNamXuatBan(int namXuatBan) {
        super.setNamXuatBan(namXuatBan);
    }

    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    public void setTacGia(String tacGia) {
        super.setTacGia(tacGia);
    }

    @Override
    public void setTieuDe(String tieuDe) {
        super.setTieuDe(tieuDe);
    }

    @Override
    public void setGiaCoBan(double giaCoBan) {
        super.setGiaCoBan(giaCoBan);
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return  super.toString()+
        "\nMon hoc: "+monHoc+
        "\nCap do: "+capDo;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan+((2025-getNamXuatBan())*5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return soLuong>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "+getTieuDe()+" đến khu vực: "+viTriMoi);
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mon hoc: "+monHoc);
        System.out.println("Cap do: "+capDo);
        System.out.println("---------------------");
    }

}