package assignment06;

public class DecimalSeperatorFormatter implements NumberFormatter{

    public DecimalSeperatorFormatter(){
    
    }
    
    public String format(int n){
        String temp = Integer.toString(n);
        boolean neg = false;
        if(temp.contains("-")){
            temp = temp.replace("-", "");
            neg = true;
        }
        String retVal = "";
        String retVal2 = "";
        for(int i = temp.length()-1;i>=0;i--){
            if((temp.length()-i-1)%3==0 && i!=temp.length()-1)
                retVal=','+retVal;
            retVal=temp.charAt(i)+retVal;
        }
        for(int i = 0;i<retVal.length();i++){
            retVal2+= retVal.charAt(retVal.length()-1-i);
        }
        if(neg)
            return "-" + retVal
        return retVal;
        
    }
}
