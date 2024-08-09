package vn.edu.cybersoft.exercise1;

public class OOPApplication1 {
    public static void main(String[] args) {
        Phanso phanso = new Phanso();
        phanso.nhap();
        Phanso phanso2 = new Phanso();
        phanso2.nhap();
        System.out.println("Ket qua phep cong: " + phanso.Cong(phanso2));
        System.out.println("Ket qua phep tru: " + phanso.Tru(phanso2));
        System.out.println("Ket qua phep nhan: " + phanso.Nhan(phanso2));
        System.out.println("Ket qua phep chia: " + phanso.Chia(phanso2));
    }
}
