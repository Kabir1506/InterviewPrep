package LLD.Factory;

public class Main {
    public static void main(String[] args) {
        OsFactory osf = new OsFactory();
        Os Aos = osf.getInstance("open");
        Aos.spec();
    }
}
