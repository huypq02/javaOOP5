package vn.edu.cybersoft.exercise1;

import java.util.InputMismatchException;

public class OOPApplication1 {
    public static void main(String[] args) {
        try {
            Phanso phanso = new Phanso();
            phanso.nhap();
            Phanso phanso2 = new Phanso();
            phanso2.nhap();
            phanso.xuat(phanso2);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Mau so phai khac 0");
            } else if (e instanceof InputMismatchException){
                System.out.println("Nhap sai kieu du lieu");
            } else {
                e.printStackTrace();
            }
        }
    }
}
