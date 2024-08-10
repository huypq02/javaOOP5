package vn.edu.cybersoft.exercise3;

import java.util.InputMismatchException;

public class OOPApplication3 {
    public static void main(String[] args) {
        try {
            System.out.println("Nhan vien san xuat");
            NhanVienSanXuat nhanVienSanXuat = new NhanVienSanXuat();
            nhanVienSanXuat.nhap();
            nhanVienSanXuat.calculate_salary();
            nhanVienSanXuat.xuat();
            System.out.println("====================================");
            System.out.println("Nhan vien van phong");
            NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong();
            nhanVienVanPhong.nhap();
            nhanVienVanPhong.calculate_salary();
            nhanVienVanPhong.xuat();
        } catch (Exception e) {
            if (e instanceof InputMismatchException){
                System.out.println("Nhap sai kieu du lieu");
            }
            e.printStackTrace();
        }
    }
}
