package vn.edu.cybersoft.exercise3;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
    private final double product_rate = 5_000;
    private double base_salary;
    private int number_of_products;

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        this.base_salary = sc.nextDouble();
        System.out.println("Nhap so luong san pham: ");
        this.number_of_products = sc.nextInt();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Luong co ban: " + this.base_salary);
        System.out.println("So luong san pham: " + this.number_of_products);
        System.out.println("Luong thuc nhan tinh theo nang suat (VND): " + super.getSalary());
    }

    public void calculate_salary(){
        setSalary(this.base_salary + this.number_of_products*this.product_rate);
    }

}
