package assignment06;

public class DefaultFormatter implements NumberFormatter{

    public DefaultFormatter(){
    
    }

    public String format(int n){
        return Integer.toString(n);
    }
}
