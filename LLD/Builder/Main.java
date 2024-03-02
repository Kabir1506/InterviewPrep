package LLD.Builder;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").getInstance();
        System.out.println(phone);
    }
}
