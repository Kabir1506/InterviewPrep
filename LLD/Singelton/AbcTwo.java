package LLD.Singelton;

public class AbcTwo {
    private static AbcTwo obj;
    private AbcTwo(){}
    public static AbcTwo getInstance(){
        if(obj==null){
            obj = new AbcTwo();
        }
        return obj;
    }
}
