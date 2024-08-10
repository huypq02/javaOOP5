package vn.edu.cybersoft.exercise2;

import java.util.InputMismatchException;

public class OOPApplication2 {
    public static void main(String[] args) {
        try {
            VanDongVien vdv = new VanDongVien();
            vdv.nhap();
            vdv.xuat();

            VanDongVien vdv2 = new VanDongVien();
            vdv2.nhap();
            vdv2.xuat();

            vdv.soSanh(vdv2);
        } catch (Exception e) {
            if (e instanceof InputMismatchException){
                System.out.println("Nhap sai kieu du lieu");
            }
            e.printStackTrace();
        }

    }
}
