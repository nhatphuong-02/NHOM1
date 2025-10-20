import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;
    private Scanner scanner;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Them sach thanh cong: " + sach.getTieuDe());
    }
    public void hienThiDanhSachSach() {
        System.out.println("\n===== DANH SACH TAT CA CAC SACH (" + danhSachSach.size() + " cuon) =====");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("---------------------------------");
        }
    }
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach; 
            }
        }
        return null;
    }
    public void capNhatSach(String maSach) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat == null) {
            System.out.println("Khong tim thay sach voi ma : " + maSach);
            return;
        }
        System.out.println("\n--- cap nhat sach co ma : " + maSach + " ---");
        System.out.print("Nhap tieu de moi (hientai: " + sachCanCapNhat.getTieuDe() + ", de trong de bo qua): ");
        String tieuDeMoi = scanner.nextLine();
        sachCanCapNhat.setTieuDe(tieuDeMoi.isEmpty() ? sachCanCapNhat.getTieuDe() : tieuDeMoi);
        System.out.print("Nhap tac gia moi (Hien tai: " + sachCanCapNhat.getTacGia() + ", de trong de bo qua ): ");
        String tacGiaMoi = scanner.nextLine();
        sachCanCapNhat.setTacGia(tacGiaMoi.isEmpty() ? sachCanCapNhat.getTacGia() : tacGiaMoi);
        try {
            System.out.print("Nhao nam xuat ban moi (Hien tai: " + sachCanCapNhat.getNamXuatBan() + ", nhap so, de trong de bo qua): ");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                int namXBMoi = Integer.parseInt(input);
                sachCanCapNhat.setNamXuatBan(namXBMoi);
            }
        } catch (NumberFormatException e) {
            System.out.println("loi nam xuat ban");
        }
        System.out.println("Cap nhat sach thanh cong");
    }
    public void xoaSach(String maSach) {
        boolean removed = danhSachSach.removeIf(sach -> sach.getMaSach().equalsIgnoreCase(maSach));
        if (removed) {
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }
}
