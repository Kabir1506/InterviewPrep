package LLD.Singelton;

public class Main {
    public static void main(String[] args) {
        AbcOne obj1 = AbcOne.getInstance();
        AbcOne obj2 = AbcOne.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        AbcTwo obj3 = AbcTwo.getInstance();
        AbcTwo obj4 = AbcTwo.getInstance();
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                AbcThree obj5 = AbcThree.getInstance();
                System.out.println(obj5.hashCode());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                AbcThree obj6 = AbcThree.getInstance();
                System.out.println(obj6.hashCode());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run(){
                AbcFour obj7 = AbcFour.getInstance();
                System.out.println(obj7.hashCode());
            }
        });
        Thread t4 = new Thread(new Runnable() {
            public void run(){
                AbcFour obj8 = AbcFour.getInstance();
                System.out.println(obj8.hashCode());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println();
    }
}

