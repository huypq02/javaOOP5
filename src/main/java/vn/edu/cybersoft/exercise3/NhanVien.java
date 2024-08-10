package vn.edu.cybersoft.exercise3;

import java.util.Scanner;

public abstract class NhanVien {
    private String name;
    private String bod;
    private double salary;

    public NhanVien(){
    }

    public NhanVien(String name, String bod){
        this.name = name;
        this.bod = bod;
        this.salary = 0;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        this.name = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.bod = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Ngay sinh: " + this.bod);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
