package LLD.SOLID;

public class LiskovSubstitution {
    class Rectangle{
        int l;
        int b;
        public void setL(int l) {
            this.l = l;
        }
        public void setB(int b) {
            this.b = b;
        }
        public int Area(){
            return this.l*this.b;
        }
    }
    class Square extends Rectangle{
        int l;
        public void setL(int l) {
            this.l = l;
        }
        public void setB(int b) {
            this.l = b;
        }
        public int Area(){
            return this.l*this.l;
        }
    }
}