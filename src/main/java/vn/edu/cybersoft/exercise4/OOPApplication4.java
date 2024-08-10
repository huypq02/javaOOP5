package vn.edu.cybersoft.exercise4;

import java.util.InputMismatchException;

public class OOPApplication4 {
    public static void main(String[] args) {
        try {
            PhuongTienGiaoThong ptgt = new PhuongTienGiaoThong();
            ptgt.nhap();
            ptgt.xuat();

            Oto oto = new Oto();
            oto.nhap();
            oto.xuat();

            Oto oto2 = new Oto();
            oto2.nhap();
            oto2.xuat();

            oto.soSanhVanTocDa(oto2);
        } catch (Exception e) {
            if (e instanceof InputMismatchException){
                System.out.println("Nhap sai kieu du lieu");
            }
            e.printStackTrace();
        }
    }
}
