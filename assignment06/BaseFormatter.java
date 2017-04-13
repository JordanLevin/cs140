package assignment06;

public class BaseFormatter implements NumberFormatter{

    private int base;
    
    public BaseFormatter(int b){
        base = b;
    }

    public String format(int n){
        return Integer.toString(n, base);
    }
}
