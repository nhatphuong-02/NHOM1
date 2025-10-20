public class Test {
    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        /* 
        Sach sach1 = new sach("S001", "Lap trinh co ban", "Pham Thanh A", 2023, 10);
        Sach sach2 = new Sach("S002", "Cau truc du lieu va giai thuat", "Pham Thanh B", 2022, 5);
        SachGiaoTrinh sach3 = new SachGiaoTrinh();
        sach3.setMaSach("001");
        sach3.setTieuDe("Co nan");
        sach3.setTacGia("Pham Thanh Tien");
        sach3.setNamXuatBan(2006);
        sach3.setSoLuong(1);
        sach3.setmonHoc("toan");
        sach3.setcapDo("3");
        SachTieuThuyet sach4=new SachTieuThuyet("001", "Sach giao khoa", "Tien bịp",2006,2,"sgv",true,20000);
        quanLy.themSach(sach1);
        quanLy.themSach(sach2);
        quanLy.themSach(sach3);
        quanLy.themSach(sach4);
        quanLy.hienThiDanhSachSach();
         String maCanTim = "TT01";
        Sach timThay = quanLy.timKiemTheoMa(maCanTim);
        if (timThay != null) {
            System.out.println("Đã tìm thấy: " + timThay.getTieuDe());
            System.out.println(timThay.toString());
        } else {
            System.out.println("Khong tim thay sach voi ma sach: " + maCanTim);
        }
         System.out.println("\n--- 4. CAP NHAT MA SACH (Ma GT01) ---");
        String maCanCapNhat = "001";
        quanLy.capNhatSach(maCanCapNhat);
        System.out.println("\n--- 5. DANH SACH SAU KHI CAP NHAT ---");
        quanLy.hienThiDanhSachSach();
        System.out.println("\n--- 6. XOA SACH (Ma S001) ---");
        String maCanXoa = "S001";
        quanLy.xoaSach(maCanXoa);
        quanLy.xoaSach("MAKHONGTONTAI"); 
        System.out.println("\n--- 7. DANH SACH CUOI CUNG ---");
        quanLy.hienThiDanhSachSach();
        */
        SachTieuThuyet ptt1=new SachTieuThuyet("001","sach giao khoa","cothay",2006,10,"sach giao khoa",true,10000);
        quanLy.themSach(ptt1);
        System.out.println("\nDanh sach sau khi them sach");
        quanLy.hienThiDanhSachSach();
        System.out.println("\nKiem tra so luong ton kho của ma sach "+ptt1.getMaSach()+":"+(ptt1.kiemTraTonKho(1)?" Đu so luong":" Kongdusoluong"));
        ptt1.capNhatViTri("Kho A1 KE 10");
        SachGiaoTrinh ptt2=new SachGiaoTrinh("002","sach giao khoa","tien bip",2005,3,"toan","3",15000);
        quanLy.themSach(ptt2);
        System.out.println("\nDanh sach sau khi them sach");
        System.out.println("\nKiem tra so luong ton kho của ma sach "+ptt2.getMaSach()+":"+(ptt2.kiemTraTonKho(1)?" Đu so luong":" Kongdusoluong"));
        ptt2.capNhatViTri("Kho A3 KE 10");
    }   
}
