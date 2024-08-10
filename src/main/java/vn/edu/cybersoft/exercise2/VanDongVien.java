package vn.edu.cybersoft.exercise2;

import java.util.Scanner;

public class VanDongVien {
    private String hoten;
    private int tuoi;
    private String monthidau;
    private double cannang;
    private double chieucao;

    public VanDongVien(){
    }

    public VanDongVien(String hoten, int tuoi, String monthidau, double cannang, double chieucao){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.monthidau = monthidau;
        this.cannang = cannang;
        this.chieucao = chieucao;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        clearBuffer(sc); // clear buffer
        System.out.println("Nhap mon thi dau: ");
        this.monthidau = sc.nextLine();
        System.out.println("Nhap can nang: ");
        this.cannang = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        this.chieucao = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("Ho ten: "+ this.hoten);
        System.out.println("Tuoi: "+ this.tuoi);
        System.out.println("Mon thi dau: "+ this.monthidau);
        System.out.println("Can nang: "+ this.cannang);
        System.out.println("Chieu cao: "+ this.chieucao);
    }

    public void soSanh(VanDongVien other){
        if(this.chieucao > other.chieucao){
            System.out.println(this.hoten + " cao hon " + other.hoten);
        } else if(this.chieucao < other.chieucao){
            System.out.println(this.hoten + " thap hon " + other.hoten);
        } else {
            if (this.cannang > other.cannang) {
                System.out.println(this.hoten + " nang hon " + other.hoten);
            } else if (this.cannang < other.cannang) {
                System.out.println(this.hoten + " nhe hon " + other.hoten);
            } else {
                System.out.println(this.hoten + " bang " + other.hoten);
            }
        }
    }

    private void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
