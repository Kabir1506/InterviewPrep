package LLD.Singelton;

public class AbcOne {
    private static AbcOne obj= new AbcOne();
    private AbcOne(){}
    public static AbcOne getInstance(){
        return obj;
    }
}
