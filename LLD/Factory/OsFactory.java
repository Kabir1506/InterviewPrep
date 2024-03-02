package LLD.Factory;

public class OsFactory {
    public Os getInstance(String type){
        if(type.equals("open")){
            return new Android();
        }
        else if(type.equals("secure")){
            return new Ios();
        }
        else{
            return new Windows();
        }
    }
}
