package TUAN6;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach=new ArrayList<>() ;

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public Sach timKiemSach(String maSach) {
        for(Sach s:danhSachSach){
            if(s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }

    public void xoaSach(String maSach){
        Sach s=timKiemSach(maSach);
        if (s!=null) {
            danhSachSach.remove(s);          
        } else {
            System.out.println("Khong tim thay sach de xoa: " + maSach);
        }
    }

    public void capNhatTieuDe(String maSach, String tieuDeMoi){
        Sach s=timKiemSach(maSach);
        if (s!=null) {
            s.setTieuDe(tieuDeMoi);          
        }
    }

    public void capNhatTacGIa(String maSach, String tacGia){
        Sach s=timKiemSach(maSach);
        if (s!=null) {
            s.setTacGia(tacGia);         
        }
    }

    public void capNhatNamXuatBan(String maSach, int namXuatBan){
        Sach s=timKiemSach(maSach);
        if (s!=null) {
            s.setNamXuatBan(namXuatBan);       
        }
    }

    public void capNhatSoLuong(String maSach, int soLuongMoi){
        Sach s=timKiemSach(maSach);
        if (s!=null) {
            s.setSoLuong(soLuongMoi);            
        }
    }

    public void hienThiDanhSachSach() {
        for(Sach s:danhSachSach) {
            System.out.println(s.toString());
        }
    } 
}
