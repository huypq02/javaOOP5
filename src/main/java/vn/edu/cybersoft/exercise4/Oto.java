package vn.edu.cybersoft.exercise4;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(String hangXe, String mauXe, int namSanXuat, double vanTocToiDa, int soChoNgoi, String kieuDongCo) {
        super(hangXe, mauXe, namSanXuat, vanTocToiDa);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }


    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cho ngoi: ");
        this.soChoNgoi = sc.nextInt();
        System.out.println("Nhap kieu dong co: ");
        this.kieuDongCo = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So cho ngoi: " + this.soChoNgoi);
        System.out.println("Kieu dong co: " + this.kieuDongCo);
    }
}
