    public class SachGiaoTrinh extends Sach implements IkiemKe{
    private String monHoc;
    private String capDo;
     public SachGiaoTrinh(){};
     public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo, double giacoban){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giacoban); 
        this.monHoc=monHoc;
        this.capDo=capDo;
     }
    public String getmonHoc() {
        return monHoc;
    }
    public void setmonHoc(String monHoc){
        this.monHoc=monHoc;
    }
    public String getcapDo() {
        return capDo;
    }
    public void setcapDo(String capDo){
        this.capDo=capDo;
    }
    @Override
    public double tinhgiaban() {
        return giacoban+(2025-getNamXuatBan())*5000;
    }
    public String toString() {
        return super.toString()+
        "\n Mon hoc: "+monHoc+
        "\n Cap do: "+ capDo+
        "\ngia co ban "+tinhgiaban();
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return soLuong>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đa chuyen sach "+getTieuDe()+" den khu vuc: "+viTriMoi);
    }
    }