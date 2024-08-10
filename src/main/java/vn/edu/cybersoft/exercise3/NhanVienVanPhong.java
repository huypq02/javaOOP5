package vn.edu.cybersoft.exercise3;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{
    final private double daily_rate = 100_000;
    private double days_worked;

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay lam viec: ");
        this.days_worked = sc.nextDouble();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So ngay lam viec: " + this.days_worked);
        System.out.println("Luong thuc nhan tinh theo so ngay (VND): " + super.getSalary());
    }

    public void calculate_salary(){
        setSalary(this.days_worked*this.daily_rate);;
    }

}
