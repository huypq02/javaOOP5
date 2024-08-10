package vn.edu.cybersoft.exercise4;

import java.util.Scanner;

public class PhuongTienGiaoThong {
    private String hangSanXuat;
    public String tenPhuongTien;
    public int namSanXuat;
    public double vanTocToiDa;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa) {
        this.hangSanXuat = hangSanXuat;
        this.tenPhuongTien = tenPhuongTien;
        this.namSanXuat = namSanXuat;
        this.vanTocToiDa = vanTocToiDa;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang san xuat: ");
        this.hangSanXuat = sc.nextLine();
        System.out.println("Nhap ten phuong tien: ");
        this.tenPhuongTien = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        this.namSanXuat = sc.nextInt();
        System.out.println("Nhap van toc toi da: ");
        this.vanTocToiDa = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Hang san xuat: " + this.hangSanXuat);
        System.out.println("Ten phuong tien: " + this.tenPhuongTien);
        System.out.println("Nam san xuat: " + this.namSanXuat);
        System.out.println("Van toc toi da: " + this.vanTocToiDa);
    }

    public void soSanhVanTocDa(PhuongTienGiaoThong phuongTienGiaoThong) {
        if (this.vanTocToiDa == phuongTienGiaoThong.vanTocToiDa) {
            System.out.println("Hai phuong tien co van toc toi da bang nhau");
        } else {
            System.out.println("Hai phuong tien co van toc toi da khac nhau");
        }
    }
}
