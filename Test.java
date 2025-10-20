public class Test {
   public static void main(String[] args) {
        Sach sach1=new Sach("001", "HoaHoc", "BGD" ,2024, 100);
        Sach sach2=new Sach("002", "SinhHoc", "BGD", 2024, 150);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        Sach sach3=new Sach();
        sach3.setMaSach("003");
        sach3.setTieuDe("Toan");
        sach3.setTacGia("BGD");
        sach3.setNamXuatBan(2024);
        sach3.setSoLuong(99);

        sach3.hienThiThongTin();

        SachGiaoTrinh sachGT1=new SachGiaoTrinh("004", "Ly", "BGD  ", 2024, 199, "Vat ly", "THPT");
        System.out.println(sachGT1.toString());

        SachTieuThuyet sachTT1=new SachTieuThuyet("005", "TruyenKieu", "NguyenDu", 2023, 50, "Co trang", false);
        System.out.println(sachTT1.toString());

        QuanLySach qlSach=new QuanLySach();
        System.out.println("Danh sach khi chua them sach:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");

        qlSach.themSach(sach1);
        qlSach.themSach(sach2);
        System.out.println("Danh sach khi them sach:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");

        System.out.println("Danh sach sau khi xoa sach co ma 002:");
        qlSach.xoaSach("002");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");

        System.out.println("Tim kiem sach co ma 001:");
        Sach maCanTim = new Sach();
        maCanTim.setMaSach("001");
        Sach ketQua=qlSach.timKiemSach(maCanTim.getMaSach());
        if (ketQua != null) {
                System.out.println("Tim thay sach co ma sach "+maCanTim.getMaSach()+"\n" + ketQua);
            } else {
                System.out.println("Khong tim thay sach co ma: " + maCanTim);
            }
        System.out.println("-------------------");
        
        
        System.out.println("Tim kiem sach co ma 002:");
        Sach maCanTim2 = new Sach();
        maCanTim2.setMaSach("002");
        Sach ketQua2=qlSach.timKiemSach(maCanTim2.getMaSach());
        if (ketQua2 != null) {
                System.out.println("Tim thay sach co ma sach "+maCanTim2.getMaSach()+"\n" + ketQua);
            } else {
                System.out.println("Khong tim thay sach co ma: " + maCanTim2.getMaSach());
            }
        System.out.println("-------------------");

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");  
        System.out.println("Cap nhat tieu de sach co ma 001 thanh 'HoaHoc1':");
        qlSach.capNhatTieuDe("001", "HoaHoc1");
        qlSach.hienThiDanhSachSach();  
        System.out.println("-------------------");

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");
        System.out.println("Cap nhat tac gia sach co ma 001 thanh 'BGD1':");
        qlSach.capNhatTacGIa("001", "BGD1");
        qlSach.hienThiDanhSachSach();  
        System.out.println("-------------------");

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");
        System.out.println("Cap nhat nam xuat ban sach co ma 001 thanh 2025:");
        qlSach.capNhatNamXuatBan("001", 2025);
        qlSach.hienThiDanhSachSach();  
        System.out.println("-------------------");

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();
        System.out.println("-------------------");
        System.out.println("Cap nhat so luong sach co ma 001 thanh 200:");
        qlSach.capNhatSoLuong("001", 200);
        qlSach.hienThiDanhSachSach();  
        System.out.println("-------------------");
    }
}