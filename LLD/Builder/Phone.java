package LLD.Builder;

public class Phone {
    String Os;
    int totalCamera;
    @Override
    public String toString() {
        return "Phone [Os=" + Os + ", totalCamera=" + totalCamera + "]";
    }
    public Phone(String os, int totalCamera) {
        Os = os;
        this.totalCamera = totalCamera;
    }
}
