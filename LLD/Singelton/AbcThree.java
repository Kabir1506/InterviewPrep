package LLD.Singelton;

public class AbcThree {
    private static AbcThree obj;
    private AbcThree(){}
    public synchronized static AbcThree getInstance(){
        if(obj==null){
            obj = new AbcThree();
        }
        return obj;
    }
}
