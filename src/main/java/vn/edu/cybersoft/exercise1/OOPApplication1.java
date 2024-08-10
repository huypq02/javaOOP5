package vn.edu.cybersoft.exercise1;

public class OOPApplication1 {
    public static void main(String[] args) {
        Phanso phanso = new Phanso();
        phanso.nhap();
        Phanso phanso2 = new Phanso();
        phanso2.nhap();
        phanso.xuat(phanso2);
    }
}
