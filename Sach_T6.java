
public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach() {
        
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public void hienThiThongTin(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
        System.out.println("_________________________________________");
    }
    public String getMaSach(){
        return maSach;
    }
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getTieuDe(){
        return tieuDe;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }
    public String getTacGia(){
        return tacGia;
    }
    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }
    public int getNamXuatBan(){
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    @Override
    public String toString(){
        return "Ma sach: "+maSach+
        "\nTieu de: "+tieuDe+
        "\nTac gia: "+tacGia+
        "\nNam xuat ban: "+namXuatBan+
        "\nSo luong: "+soLuong;
    }

    
}
