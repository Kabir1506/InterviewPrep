package LLD.Singelton;

public class AbcFour {
    private static AbcFour obj;
    private AbcFour(){}
    public static AbcFour getInstance(){
        if(obj==null){
            synchronized(AbcFour.class){
                if(obj==null){
                    obj = new AbcFour();
                }
            }
            return obj;
        }
        return obj;
    }
}
