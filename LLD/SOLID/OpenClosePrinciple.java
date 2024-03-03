package LLD.SOLID;

public class OpenClosePrinciple {
    /*
     * Not proper
     */
    public static void main(String[] args) {
        int area=0;
        for(shape s:Shapes){
            if(s.equals("Circle")){
                area+=Math.pi*r*r;
            }
            else if(s.equals("Square")){
                area+=l*l;
            }
        }
    }
    /*
     * Proper Form
     */
    class Shape{
        public int Area();
    }
    class Rectangle extends Shape(){
        public void Area(int l,int b) {
            return l*b;
        }
    }
    class Square extends Shape(){
        public void Area(int l) {
            return l*l;
        }
    }
}
