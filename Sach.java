package TUAN5;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int NXB;
    private int soLuong;

    public Sach(){

    }
    public Sach(String maSach, String tieuDe, String tacGia, int NXB, int soLuong){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.soLuong = soLuong;
    }

    public void hienthithongtin(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+NXB);
        System.out.println("So luong: "+soLuong);
        System.out.println("____________________");
    }

    public String getmaSach(){
        return maSach;
    }

    public void setmaSach(String maSach){
        this.maSach = maSach;
    }

    public String gettieuDe(){
        return tieuDe;
    }

    public void settieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }

    public String gettacGia(){
        return tacGia;
    }

    public void settacgia(String tacGia){
        this.tacGia = tacGia;
    }

    public int getNXB(){
        return NXB;
    }

    public void setNXB(int NXB){
        this.NXB = NXB;
    }

    public int getsoLuong(){
        return soLuong;
    }

    public void setsoLuong(int soLuong){
        this.soLuong = soLuong;
    }


}
