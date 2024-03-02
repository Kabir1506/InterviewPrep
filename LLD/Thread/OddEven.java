package LLD.Thread;

public class OddEven {
    int i=1;
    public static void main(String[] args) {
        int n=10;
        OddEven oddEven = new OddEven();
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                try {
                    oddEven.printOddNumber();
                } catch (IllegalArgumentException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                try {
                    oddEven.printEvenNumber();
                } catch (IllegalArgumentException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
    public void printOddNumber() throws IllegalArgumentException,InterruptedException{
        synchronized(this){
            while(i<10){
                while(i%2==0){
                    wait();
                }
                if(i%2!=0){
                    System.out.println(i);
                }
                i++;
                notify();
            }
        }
    }
    public void printEvenNumber() throws IllegalArgumentException,InterruptedException{
        synchronized(this){
            while(i<10){
                while(i%2!=0){
                    wait();
                }
                if(i%2==0){
                    System.out.println(i);
                }
                i++;
                notify();
            }
        }   
    }   
}
