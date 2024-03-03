package LLD.SOLID;

public class DependencyInversion {
    void copy(OutputDevice dev){
        int c;
        while(c=ReadKeyBoard()){
            if(dev==Printer){
                writeToPrinter();
            }
            else{
                writeToDisk();
            }
        }
    }
    /*
     * Correct way
     */
    interface Reader(){
        char read();
    }
    interface Writer(){
        void write(char c);
    }
    void copy(Reader r,Writer w){
        char ch;
        while(ch!=r.read()){
            w.write(c);
        }
    }
}
