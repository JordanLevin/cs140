package assignment06;

public class AccountingFormatter implements NumberFormatter{

    public AccountingFormatter(){
    
    }
    
    public String format(int n){
        String temp = Integer.toString(n);
        if(n<0){

            temp = temp.replace("-", "");
            temp = "(" + temp + ")";
            return temp;
        }
        return temp;
    }
}
