package assignment07;

import java.text.DecimalFormat;

public class Price{
    private long dollars;
    private int cents;
    DecimalFormat df = new DecimalFormat("#.00");
    
    public Price(long d, int c){
        if(d<0 || c<0){
            throw new IllegalArgumentException("one of the inputs is negative");
        }
        if(c>=100){
            throw new IllegalArgumentException("c param >=100");
        }
        dollars = d;
        cents = c;
    }
    public double concat(){
    	return (double) dollars + cents*.01;
    }
    public void update(double value){
        String temp = df.format(value);
        String[] arr = temp.split("\\.");
        dollars = Long.parseLong(arr[0]);
        cents = Integer.parseInt(arr[1]);
    }
    public void changeUp(double percent){
        if(percent<0)
            throw new IllegalArgumentException("percent less than < 0");
        double temp = concat();
        update(temp+temp*percent*.01);
    }

    public void changeDown(double percent){
        if(percent<0)
            throw new IllegalArgumentException("percent less than < 0");
        double temp = concat();
        update(temp-temp*percent*.01);
    }
    public String toString(){
    	
        return "$" + df.format(concat());
    }


}
