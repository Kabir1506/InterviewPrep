package LLD.Builder;

public class PhoneBuilder {
    String os;
    int totalCamera;
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setTotalCamera(int totalCamera) {
        this.totalCamera = totalCamera;
        return this;
    }
    public Phone getInstance(){
        return new Phone(os, totalCamera);
    }
}
