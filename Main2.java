package praktikumpbo;

class A {
    public static void tampil() {
        System.out.println("ini class A");
    }
}

public class Main2 {
    public static void tampil() {
        System.out.println("ini class Main");
    }
    
    public static void main(String[] args) {
        Main2.tampil();
        A.tampil();
    }
}
