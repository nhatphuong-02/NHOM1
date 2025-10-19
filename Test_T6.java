public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("001", "Toan", "BGD", 2006, 100);
        Sach sach2 = new Sach("002", "Van", "BGD", 2006, 100);
        
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        Sach sach3 = new Sach();
        sach3.setMaSach("003");
        sach3.setTieuDe("Hoa hoc");
        sach3.setTacGia("BGD");
        sach3.setNamXuatBan(2006);
        sach3.setSoLuong(150);

        sach3.hienThiThongTin();

        SachGiaoTrinh sachGT1 = new SachGiaoTrinh("004","Giai tich nang cao","BGD",2007,143,"Toan cao cap","Dai hoc");
        System.out.println(sachGT1.toString());
        
        SachTieuThuyet sachTT1 = new SachTieuThuyet("005", "Alibaba", "leThinh", 2000, 999, "Ao tuong", false);
        System.out.println(sachTT1.toString());

        QuanLySach qLySach = new QuanLySach();
        System.out.println("Danh sach sach hien tai: ");
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

        qLySach.themSach(sach1);
        qLySach.themSach(sach2);
        qLySach.themSach(sach3);
        System.out.println("Danh sach sau khi them sach: ");
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

        System.out.println("Danh sach sau khi xoa sach co ma 001: ");
        qLySach.xoaSach("001");
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

        System.out.println("Tim kiem sach co ma 002");
        Sach maCanTim = new Sach();
        maCanTim.setMaSach("002");
        Sach kqua = qLySach.timKiemSach(maCanTim.getMaSach());
        if(kqua != null){
            System.out.println("Tim thay sach co ma sach "+maCanTim.getMaSach()+"\n"+kqua);
        }
        else{
            System.out.println("Khong tim thay ma sach: "+maCanTim.getMaSach());
        }
        System.out.println("_____________________________________________");

        System.out.println("Cap nhat tac gia sach co ma 003 thanh 'LeThinh': ");
        qLySach.capNhatTacGia("003", "LeThinh");
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

        System.out.println("Cap nhat nam xuat ban sach co ma 003 thanh '2019': ");
        qLySach.capNhatNamXuatBan("003", 2019);
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

        System.out.println("Cap nhat so luong sach co ma 003 thanh '120': ");
        qLySach.capNhatSoLuong("003", 99);
        qLySach.hienThiThongTin();
        System.out.println("_____________________________________________");

    }
    
}
