package vn.edu.cybersoft.exercise1;

import java.util.Scanner;

public class Phanso {
    private double mauso, tuso;

    public Phanso(){
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tuso = sc.nextDouble();
        System.out.println(("Nhap mau so: "));
        this.mauso = sc.nextDouble();
    }

    public double Cong(Phanso other){
        return (this.tuso* other.mauso + other.tuso*this.mauso)/ (this.mauso * other.mauso);
    }

    public double Tru(Phanso other){
        return (this.tuso* other.mauso - other.tuso*this.mauso)/ (this.mauso * other.mauso);
    }

    public double Nhan(Phanso other){
        return (this.tuso * other.tuso)/(this.mauso * other.mauso);
    }

    public double Chia(Phanso other){
        return (this.tuso * other.mauso)/(this.mauso * other.tuso);
    }

    public void xuat(){
        System.out.println("Ket qua phep cong: "+ this.tuso + "/" + this.mauso);
    }
}
