package assignment06;

public class Tester{

    public static void main(String[] args){
        AccountingFormatter af = new AccountingFormatter();
        DecimalSeperatorFormatter dsf = new DecimalSeperatorFormatter();
        DefaultFormatter df = new DefaultFormatter();
        BaseFormatter bf = new BaseFormatter(35);
        
        System.out.println(af.format(100));
        System.out.println(dsf.format(98765456));
        System.out.println(df.format(-100));
        System.out.println(bf.format(-100));
        
    }
}
